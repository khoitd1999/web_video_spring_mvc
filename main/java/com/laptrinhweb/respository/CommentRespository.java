package com.laptrinhweb.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhweb.entity.CommentEntity;
import com.laptrinhweb.entity.UserEntity;
import com.laptrinhweb.entity.VideoEntity;

public interface CommentRespository extends JpaRepository<CommentEntity, Long>{
	List<CommentEntity> findByUser(UserEntity user);
	List<CommentEntity> findByVideo(VideoEntity video);
}
