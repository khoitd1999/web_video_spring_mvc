package com.laptrinhweb.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.laptrinhweb.dto.VideoDTO;

public interface IVideoService {
	List<VideoDTO> findByCategory(Long id);
	List<VideoDTO> findByCategory(Long id ,Pageable pageable);
	VideoDTO findOne(Long id);
	VideoDTO save(VideoDTO video);
	void delete(Long[] id);
}
