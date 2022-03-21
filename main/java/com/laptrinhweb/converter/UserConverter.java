package com.laptrinhweb.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.laptrinhweb.dto.UserDTO;
import com.laptrinhweb.entity.UserEntity;

@Component
public class UserConverter {
	
	ModelMapper mm = new ModelMapper();
	
	public List<UserDTO> toDTO(List<UserEntity> entities){
		List<UserDTO> result = new ArrayList<UserDTO>();
		for(UserEntity entity : entities) {
			UserDTO user = new UserDTO();
			mm.map(entity,user);
			result.add(user);
		}
		return result;
	}
}
