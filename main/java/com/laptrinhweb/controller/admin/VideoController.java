package com.laptrinhweb.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhweb.dto.VideoDTO;
import com.laptrinhweb.service.IVideoService;

@Controller("videoOfAdminController")
public class VideoController {
	
	@Autowired
	private IVideoService videoService;
	
	@RequestMapping(value = "/admin-video/list", method = RequestMethod.GET)
	public ModelAndView listPage(@RequestParam("idC") Long idC) {
		ModelAndView mav = new ModelAndView("admin/video/list");
		List<VideoDTO> video = videoService.findByCategory(idC);
		mav.addObject("videoModel",video);
		return mav;
	}
}
