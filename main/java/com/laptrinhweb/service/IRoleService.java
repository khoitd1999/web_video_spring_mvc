package com.laptrinhweb.service;

import java.util.List;

import com.laptrinhweb.dto.RoleDTO;

public interface IRoleService {
	List<RoleDTO> findAll();
	RoleDTO findOne(Long id);
}
