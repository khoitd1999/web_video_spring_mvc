package com.laptrinhweb.util;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import com.laptrinhweb.dto.MyUser;

public class SecurityUtil {
	public static MyUser getPrincipal() {
		MyUser myUser = (MyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return myUser;
	}
	@SuppressWarnings("unchecked")
	public static String getAuthorities(){
		String result;
		List<GrantedAuthority> authorities = (List<GrantedAuthority>) SecurityContextHolder
							.getContext().getAuthentication().getAuthorities();
		result = authorities.get(0).getAuthority();
		return result;
	}
}
