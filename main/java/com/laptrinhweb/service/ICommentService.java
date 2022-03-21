package com.laptrinhweb.service;

import java.util.List;

import com.laptrinhweb.dto.CommentDTO;

public interface ICommentService {
	List<CommentDTO> findByUser(Long idU);
	List<CommentDTO> findByVideo(Long idV);
	CommentDTO save(CommentDTO commentDTO);
	void delete(Long[] ids);
}
