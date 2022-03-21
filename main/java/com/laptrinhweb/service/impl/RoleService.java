package com.laptrinhweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhweb.dto.RoleDTO;
import com.laptrinhweb.entity.RoleEntity;
import com.laptrinhweb.respository.RoleRespository;
import com.laptrinhweb.service.IRoleService;

@Service
public class RoleService implements IRoleService{

	@Autowired
	private RoleRespository roleRespository;
	
	public List<RoleDTO> findAll() {
		List<RoleDTO> result = new ArrayList<RoleDTO>();
		List<RoleEntity> entities = roleRespository.findAll();
		ModelMapper mm = new ModelMapper();
		for(RoleEntity entity : entities) {
			RoleDTO role = new RoleDTO();
			mm.map(entity, role);
			result.add(role);
		}
		return result;
	}

	public RoleDTO findOne(Long id) {
		RoleDTO dto = new RoleDTO();
		RoleEntity entity = roleRespository.findOne(id);
		ModelMapper mm = new ModelMapper();
		mm.map(entity,dto);
		return dto;
	}

}
