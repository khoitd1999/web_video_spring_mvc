package com.laptrinhweb.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.laptrinhweb.dto.CommentDTO;
import com.laptrinhweb.entity.CommentEntity;

@Component
public class CommentConverter {
	
	private ModelMapper mm = new ModelMapper();
	
	public List<CommentDTO> toDTO(List<CommentEntity> entities){
		List<CommentDTO> result = new ArrayList<CommentDTO>();
		for(CommentEntity entity : entities) {
			CommentDTO comment = new CommentDTO();
			mm.map(entity,comment);
			result.add(comment);
		}
		return result;
	}
}
