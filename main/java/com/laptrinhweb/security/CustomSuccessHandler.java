package com.laptrinhweb.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.laptrinhweb.util.SecurityUtil;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	public RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException {
		String targetUrl = determineTargetUrl(authentication); // after check authentication done . targetUrl return url perfer 
		if (response.isCommitted()) {
			return;
		}
		redirectStrategy.sendRedirect(request, response, targetUrl);
	}
	
	private String determineTargetUrl(Authentication authentication) {
		String url = "";
		String role = SecurityUtil.getAuthorities();
		if(role.equals("ADMIN")) {
			url = "/admin-home";
		}else {
			url = "/trang-chu";
		}
		return url;
	}
}
