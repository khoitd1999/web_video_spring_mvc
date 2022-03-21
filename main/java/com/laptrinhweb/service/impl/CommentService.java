package com.laptrinhweb.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhweb.converter.CommentConverter;
import com.laptrinhweb.dto.CommentDTO;
import com.laptrinhweb.entity.CommentEntity;
import com.laptrinhweb.entity.UserEntity;
import com.laptrinhweb.entity.VideoEntity;
import com.laptrinhweb.respository.CommentRespository;
import com.laptrinhweb.respository.UserRespository;
import com.laptrinhweb.respository.VideoRespository;
import com.laptrinhweb.service.ICommentService;
import com.laptrinhweb.util.SecurityUtil;

@Service
public class CommentService implements ICommentService{

	@Autowired
	private CommentRespository commentRespository;
	
	@Autowired
	private UserRespository userRespository;
	
	@Autowired
	private VideoRespository videoRespository;
	
	@Autowired
	private CommentConverter commentConverter;
	
	public List<CommentDTO> findByUser(Long idU) {
		UserEntity user = userRespository.findOne(idU);
		List<CommentEntity> entities = commentRespository.findByUser(user);
		List<CommentDTO> result = commentConverter.toDTO(entities);
		return result;
	}

	public List<CommentDTO> findByVideo(Long idV) {
		VideoEntity video = videoRespository.findOne(idV);
		List<CommentEntity> entities = commentRespository.findByVideo(video);
		List<CommentDTO> result = commentConverter.toDTO(entities);
		return result;
	}

	@Transactional
	public CommentDTO save(CommentDTO commentDTO) {
		VideoEntity video = videoRespository.findOne(commentDTO.getIdV());
		String name = SecurityUtil.getPrincipal().getUsername();
		UserEntity user = userRespository.findOneByUsername(name);
		CommentEntity commentEntity = new CommentEntity();
		ModelMapper mm = new ModelMapper();
		mm.map(commentDTO,commentEntity);
		commentEntity.setVideo(video);
		commentEntity.setUser(user);
		return null;
	}

	@Transactional
	public void delete(Long[] ids) {
		for(Long id : ids) {
			commentRespository.delete(id);
		}
	}

}
