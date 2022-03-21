<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800">Tables</h1>
          <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below. For more information about DataTables, please visit the <a target="_blank" href="https://datatables.net">official DataTables documentation</a>.</p>

          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>Tiêu đề</th>
                      <th>Ảnh đại diện</th>
                      <th>Nội dung</th>
                      <th>Ngày tạo</th>
                      <th>Người tạo</th>
                      <th>Ngày sửa</th>
                      <th>Người sửa</th>
                      <th>Thể loại</th>
                      <th>Mô tả ngắn</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="item" items="${videoModel}">
                    	 <tr>
	                      <th>${item.title}</th>
	                      <th>${item.thumbnail}</th>
	                      <th>${item.content}</th>
	                      <th>${item.createdDate}</th>
	                      <th>${item.createdBy}</th>
	                      <th>${item.modifiedDate}</th>
	                      <th>${item.modifiedBy}</th>
	                      <th>${item.category.name}</th>
	                      <th>${item.shortdescription}</th>
	                    </tr>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
            </div>
          </div>

        </div>
        <!-- /.container-fluid -->
</body>
</html>