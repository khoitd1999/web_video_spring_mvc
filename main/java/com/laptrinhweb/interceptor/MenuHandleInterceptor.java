package com.laptrinhweb.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhweb.dto.CategoryDTO;
import com.laptrinhweb.dto.RoleDTO;
import com.laptrinhweb.service.ICategoryService;
import com.laptrinhweb.service.IRoleService;

public class MenuHandleInterceptor implements HandlerInterceptor{

	@Autowired
	private ICategoryService categoryService;
	
	@Autowired
	private IRoleService roleService;
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		List<CategoryDTO> categoryModel = categoryService.findAll();
		request.setAttribute("categoryModel", categoryModel);
		List<RoleDTO> roleModel = roleService.findAll();
		request.setAttribute("roleModel", roleModel);
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
