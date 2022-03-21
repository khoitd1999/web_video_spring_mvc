<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file ="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/template/web/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/template/web/heroic-features.css" />" rel="stylesheet">
</head>
<body>
	<!-- header -->
	<%@ include file="/common/web/header.jsp" %>
	
	<!-- body -->
	<dec:body />
	
	<!-- footer -->	
	<%@ include file="/common/web/footer.jsp" %>	
	<script src="<c:url value="/template/web/jquery.min.js"/>"></script>
  	<script src="<c:url value="/template/web/bootstrap.bundle.min.js" />"></script>
</body>
</html>