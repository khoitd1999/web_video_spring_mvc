package com.laptrinhweb.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.laptrinhweb.dto.VideoDTO;
import com.laptrinhweb.entity.VideoEntity;

@Component
public class VideoConverter {
	private ModelMapper mm = new ModelMapper();
	
	public List<VideoDTO> toListDTO(List<VideoEntity> entities){
		List<VideoDTO> result = new ArrayList<VideoDTO>();
		for(VideoEntity item : entities) {
			VideoDTO video = new VideoDTO();
			mm.map(item, video);
			result.add(video);
		}
		return result;
	}
}
