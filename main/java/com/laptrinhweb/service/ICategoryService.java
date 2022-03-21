package com.laptrinhweb.service;

import java.util.List;

import com.laptrinhweb.dto.CategoryDTO;

public interface ICategoryService {
	List<CategoryDTO>  findAll();
	CategoryDTO findOne(Long id);
}
