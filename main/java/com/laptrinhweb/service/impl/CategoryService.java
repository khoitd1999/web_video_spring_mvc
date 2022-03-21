package com.laptrinhweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhweb.dto.CategoryDTO;
import com.laptrinhweb.entity.CategoryEntity;
import com.laptrinhweb.respository.CategoryRespository;
import com.laptrinhweb.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService{

	@Autowired
	private CategoryRespository categoryRespository;
	
	public List<CategoryDTO> findAll() {
		List<CategoryDTO> result = new ArrayList<CategoryDTO>();
		List<CategoryEntity> entities = categoryRespository.findAll();
		ModelMapper mm = new ModelMapper();
		for(CategoryEntity entity : entities) {
			CategoryDTO role = new CategoryDTO();
			mm.map(entity, role);
			result.add(role);
		}
		return result;
	}

	public CategoryDTO findOne(Long id) {
		CategoryDTO dto = new CategoryDTO();
		CategoryEntity entity = categoryRespository.findOne(id);
		ModelMapper mm = new ModelMapper();
		mm.map(entity,dto);
		return dto;
	}


}
