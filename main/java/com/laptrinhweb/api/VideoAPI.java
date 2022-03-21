package com.laptrinhweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhweb.dto.VideoDTO;
import com.laptrinhweb.service.IVideoService;

@RestController(value = "videoAPI")
public class VideoAPI {

	@Autowired
	private IVideoService videoService;
	
	@PostMapping(value = "/api-video")
	public void createVideo(@RequestBody VideoDTO video) {
		videoService.save(video);
	}
	
	@PutMapping(value = "/api-video")
	public void updateVideo(@RequestBody VideoDTO video) {
		videoService.save(video);
	}
	
	@DeleteMapping(value = "/api-video")
	public void deleteVideo(@RequestBody Long[] ids) {
		videoService.delete(ids);
	}
}
