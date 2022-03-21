<%@page import="com.laptrinhweb.util.SecurityUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file ="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="<c:url value="/trang-chu" />">Video</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<security:authorize access="isAnonymous()">
						<li class="nav-item"><a class="nav-link" href="<c:url value="/dang-nhap" />">Đăng nhập</a></li>
						<li class="nav-item"><a class="nav-link" href="<c:url value="/dang-ki" />">Đăng kí</a></li>
					</security:authorize>
					<security:authorize access="isAuthenticated()">
						<li class="nav-item"><a class="nav-link" href="#">Xin Chào [<%= SecurityUtil.getPrincipal().getFullname() %>]</a></li>
						<li class="nav-item"><a class="nav-link" href="<c:url value="/dang-xuat" />">Đăng xuất</a></li>
					</security:authorize>
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>