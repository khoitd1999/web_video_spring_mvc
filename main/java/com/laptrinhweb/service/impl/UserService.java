package com.laptrinhweb.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhweb.converter.UserConverter;
import com.laptrinhweb.dto.UserDTO;
import com.laptrinhweb.entity.CommentEntity;
import com.laptrinhweb.entity.RoleEntity;
import com.laptrinhweb.entity.UserEntity;
import com.laptrinhweb.respository.RoleRespository;
import com.laptrinhweb.respository.UserRespository;
import com.laptrinhweb.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRespository userRespository;
	
	@Autowired
	private RoleRespository roleRespository;
	
	@Autowired
	private UserConverter userConverter;
	
	@Transactional
	public UserDTO save(UserDTO user) {
		RoleEntity role = roleRespository.findOne(user.getIdR());
		ModelMapper mm = new ModelMapper();
		UserEntity entity = new UserEntity();
		user.setPassword(convertPasswordToBCrypt(user.getPassword()));
		mm.map(user,entity);
		entity.setRoles(role);
		mm.map(userRespository.save(entity),user);
		user.setIdR(role.getId());
		return user;
	}

	public String convertPasswordToBCrypt(String password) {
		PasswordEncoder encode = new BCryptPasswordEncoder();
		return encode.encode(password);
	}

	public List<UserDTO> findByRoles(Long idR) {
		RoleEntity role = roleRespository.findOne(idR);
		List<UserEntity> entities = userRespository.findByRoles(role);
		List<UserDTO> result = userConverter.toDTO(entities);
		return result;
	}

	public List<UserDTO> findByComments(CommentEntity comment) {
		// TODO Auto-generated method stub
		return null;
	}
}
