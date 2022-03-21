<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/template/admin/vendor/fontawesome-free/css/all.min.css" />" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<link href="<c:url value="/template/admin/css/sb-admin-2.min.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/template/admin/vendor/datatables/dataTables.bootstrap4.min.css" />" rel="stylesheet">
</head>
<body id="page-top">
	<div id="wrapper">
		<!-- menu -->
		<%@ include file="/common/admin/menu.jsp" %>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<%@ include file="/common/admin/header.jsp" %>
				<dec:body />
			</div>
			<%@ include file="/common/admin/footer.jsp" %>
		</div>
	</div>	
  
  <script src="<c:url value="/template/admin/vendor/jquery/jquery.min.js" />"></script>
  <script src="<c:url value="/template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js" />"></script>
  <script src="<c:url value="/template/admin/vendor/jquery-easing/jquery.easing.min.js" />"></script>
  <script src="<c:url value="/template/admin/js/sb-admin-2.min.js" />"></script>
  <script src="<c:url value="/template/admin/vendor/chart.js/Chart.min.js" />"></script>
  <script src="<c:url value="/template/admin/js/demo/chart-area-demo.js" />"></script>
  <script src="<c:url value="/template/admin/js/demo/chart-pie-demo.js" />"></script>
  <script src="<c:url value="/template/admin/vendor/datatables/jquery.dataTables.min.js" />"></script>
  <script src="<c:url value="/template/admin/vendor/datatables/dataTables.bootstrap4.min.js" />"></script>
  <script src="<c:url value="/template/admin/js/demo/datatables-demo.js" />"></script>
</body>
</html>