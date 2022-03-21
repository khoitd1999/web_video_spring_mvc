package com.laptrinhweb.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoryDTO extends AbstractDTO{
	private String name;
	private String code;
	private List<VideoDTO> video = new ArrayList<VideoDTO>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<VideoDTO> getVideo() {
		return video;
	}
	public void setVideo(List<VideoDTO> video) {
		this.video = video;
	}
	
}
