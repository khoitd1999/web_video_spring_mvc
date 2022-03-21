package com.laptrinhweb.dto;

public class CommentDTO extends AbstractDTO{
	private String content;

	private VideoDTO video ;
	
	private UserDTO user ;
	
	private Long idU;
	
	private Long idV;
	
	public Long getIdU() {
		return idU;
	}

	public void setIdU(Long idU) {
		this.idU = idU;
	}

	public Long getIdV() {
		return idV;
	}

	public void setIdV(Long idV) {
		this.idV = idV;
	}

	public VideoDTO getVideo() {
		return video;
	}

	public void setVideo(VideoDTO video) {
		this.video = video;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
