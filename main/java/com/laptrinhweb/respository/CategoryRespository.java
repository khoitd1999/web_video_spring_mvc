package com.laptrinhweb.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhweb.entity.CategoryEntity;

public interface CategoryRespository extends JpaRepository<CategoryEntity, Long>{

}
