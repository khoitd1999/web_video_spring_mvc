package com.laptrinhweb.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhweb.entity.RoleEntity;
import com.laptrinhweb.entity.UserEntity;

public interface UserRespository extends JpaRepository<UserEntity, Long>{
	UserEntity findOneByUsername(String username);
	List<UserEntity> findByRoles(RoleEntity roles);
}
