package com.laptrinhweb.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDTO extends AbstractDTO{
	private String username;
	private String password;
	private String fullname;
	private Long idR;
	private List<CommentDTO> comment = new ArrayList<CommentDTO>();
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public List<CommentDTO> getComment() {
		return comment;
	}
	public void setComment(List<CommentDTO> comment) {
		this.comment = comment;
	}
	public Long getIdR() {
		return idR;
	}
	public void setIdR(Long idR) {
		this.idR = idR;
	}

}
