package com.laptrinhweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "video")
public class VideoEntity extends BaseEntity{
	
	@Column(name = "thumbnail", columnDefinition = "TEXT")
	private String thumbnail;
	
	@Column(name = "shortdescription", columnDefinition = "TEXT")
	private String shortdescription;
	
	@Column(name = "content" , columnDefinition = "TEXT")
	private String content;
	
	@Column(name = "title" , columnDefinition = "TEXT")
	private String title;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idC")
	private CategoryEntity category;
	
	@OneToMany(mappedBy = "video")
	private List<CommentEntity> comments = new ArrayList<CommentEntity>();
	
	
	public List<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(List<CommentEntity> comments) {
		this.comments = comments;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
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
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
