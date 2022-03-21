package com.laptrinhweb.dto;

import java.util.ArrayList;
import java.util.List;

public class RoleDTO extends AbstractDTO{
	private String name;
	private String code;
	private List<UserDTO> users = new ArrayList<UserDTO>();
	
	
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
	public List<UserDTO> getUsers() {
		return users;
	}
	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}
	
}
