package com.laptrinhweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity{
	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
	@OneToMany(mappedBy = "category")
	private List<VideoEntity> videos = new ArrayList<VideoEntity>();
	
	public List<VideoEntity> getVideos() {
		return videos;
	}

	public void setVideos(List<VideoEntity> videos) {
		this.videos = videos;
	}

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
	
}
