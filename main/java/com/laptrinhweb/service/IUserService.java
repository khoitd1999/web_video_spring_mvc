package com.laptrinhweb.service;

import java.util.List;

import com.laptrinhweb.dto.UserDTO;
import com.laptrinhweb.entity.CommentEntity;

public interface IUserService {
	UserDTO save(UserDTO user);
	List<UserDTO> findByRoles(Long idR);
	List<UserDTO> findByComments(CommentEntity comment);
}
