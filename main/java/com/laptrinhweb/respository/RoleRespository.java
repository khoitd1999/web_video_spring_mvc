package com.laptrinhweb.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhweb.entity.RoleEntity;

public interface RoleRespository extends JpaRepository<RoleEntity, Long>{
	
}
