package com.laptrinhweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.laptrinhweb.dto.MyUser;
import com.laptrinhweb.entity.UserEntity;
import com.laptrinhweb.respository.UserRespository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRespository userRespository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = userRespository.findOneByUsername(username);
		
		if(user == null)
			throw new UsernameNotFoundException("User not found");
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(user.getRoles().getCode()));
		
		MyUser myUser = new MyUser(user.getUsername(), user.getPassword(), true, true, true, true, authorities);
		myUser.setFullname(user.getFullname());
		
		return myUser;
	}

}
