package com.laptrinhweb.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhweb.converter.VideoConverter;
import com.laptrinhweb.dto.VideoDTO;
import com.laptrinhweb.entity.CategoryEntity;
import com.laptrinhweb.entity.VideoEntity;
import com.laptrinhweb.respository.CategoryRespository;
import com.laptrinhweb.respository.VideoRespository;
import com.laptrinhweb.service.IVideoService;

@Service
public class VideoService implements IVideoService{

	@Autowired
	private CategoryRespository categoryRespository;
	
	@Autowired
	private VideoRespository videoRespository;
	
	@Autowired
	private VideoConverter videoConverter;

	public VideoDTO findOne(Long id) {
		ModelMapper mm = new ModelMapper();
		VideoDTO dto = new VideoDTO();
		VideoEntity entity = videoRespository.findOne(id);
		mm.map(entity, dto);
		return dto;
	}

	@Transactional
	public VideoDTO save(VideoDTO video) {
		VideoEntity entity = new VideoEntity();
		ModelMapper mm = new ModelMapper();
		if(video.getId() != null) 
			entity = videoRespository.findOne(video.getId());
		mm.map(video , entity);
		entity.setCategory(categoryRespository.findOne(video.getIdC()));
		mm.map(videoRespository.save(entity),video);
		return video;
	}

	@Transactional
	public void delete(Long[] ids) {
		for(Long id : ids) {
			videoRespository.delete(id);
		}
	}

	
	public List<VideoDTO> findByCategory(Long id) {
		CategoryEntity category = categoryRespository.findOne(id);
		List<VideoEntity> entities = videoRespository.findAllByCategory(category); 
		List<VideoDTO> result = videoConverter.toListDTO(entities);
		return result;
	}

	public List<VideoDTO> findByCategory(Long id, Pageable pageable) {
		CategoryEntity category = categoryRespository.findOne(id);
		List<VideoEntity> entities = videoRespository.findAllByCategory(category,pageable); 
		List<VideoDTO> result = videoConverter.toListDTO(entities);
		return result;
	}

}
