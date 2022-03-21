package com.laptrinhweb.dto;

import java.util.List;

public class VideoDTO extends AbstractDTO{
	private String thumbnail;
	private String shortdescription;
	private String content;
	private CategoryDTO category;
	private List<CommentDTO> comment;
	private Long idC;
	private String title;
	
	public Long getIdC() {
		return idC;
	}
	public void setIdC(Long idC) {
		this.idC = idC;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getShortdescription() {
		return shortdescription;
	}
	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<CommentDTO> getComment() {
		return comment;
	}
	public void setComment(List<CommentDTO> comment) {
		this.comment = comment;
	}
	public CategoryDTO getCategory() {
		return category;
	}
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
}
