package com.laptrinhweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhweb.dto.UserDTO;
import com.laptrinhweb.service.IUserService;

@RestController(value = "apiOfUser")
public class UserAPI {
	@Autowired
	private IUserService userService;
	
	@GetMapping(value = "/api-user")
	public List<UserDTO> getUser(@RequestBody UserDTO user) {
		return userService.findByRoles(user.getIdR());
	}
	
	@PostMapping(value = "/api-user")
	public UserDTO createUser(@RequestBody UserDTO user) {
		return userService.save(user);
	}
}
