package com.laptrinhweb.respository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.laptrinhweb.entity.CategoryEntity;
import com.laptrinhweb.entity.VideoEntity;

public interface VideoRespository extends CrudRepository<VideoEntity, Long>{
	
	List<VideoEntity> findAllByCategory(CategoryEntity category);
	List<VideoEntity> findAllByCategory(CategoryEntity category,Pageable pageable);
}
