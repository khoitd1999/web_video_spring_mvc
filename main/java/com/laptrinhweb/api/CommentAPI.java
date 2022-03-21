package com.laptrinhweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhweb.dto.CommentDTO;
import com.laptrinhweb.service.ICommentService;

@RestController(value = "apiOfComment")
public class CommentAPI {
	
	@Autowired
	private ICommentService commentService;
	
	@GetMapping(value = "/api-comment-user")
	public List<CommentDTO> getCommentByUser(@RequestBody CommentDTO comment){
		return commentService.findByUser(comment.getIdU());
	}
	
	@GetMapping(value = "/api-comment-video")
	public List<CommentDTO> getCommentByVideo(@RequestBody CommentDTO comment){
		return commentService.findByVideo(comment.getIdV());
	}
	
	@PostMapping(value = "/api-comment")
	public CommentDTO postComment(@RequestBody CommentDTO comment) {
		return commentService.save(comment);
	}
	
	@DeleteMapping(value = "/api-comment")
	public void deleteComment(@RequestBody Long[] ids) {
		commentService.delete(ids);
	}
}
