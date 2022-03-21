<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/taglib.jsp" %>
    <c:url var="APIuser" value="/api-user"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng kí</title>
</head>
<body>
	 <div class="main">
		<c:if test="${param.not_success != null }">
			<div class="alert alert-danger">
	  			<strong> Register not success </strong>
			</div>
		</c:if>
		<c:if test="${param.not_equal!= null }">
			<div class="alert alert-danger">
	  			<strong> Password is different from repeat password </strong>
			</div>
		</c:if>
		<c:if test="${param.lackOfInfo != null }">
			<div class="alert alert-danger">
	  			<strong> Lack of information </strong>
			</div>
		</c:if>
        <section class="signup">
            <!-- <img src="images/signup-bg.jpg" alt=""> -->
            <div class="container">
                <div class="signup-content">
                    <form id="formSubmit" class="signup-form">
                        <h2 class="form-title">Create account</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="username" id="username" placeholder="Username" value=""/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="fullname" id="fullname" placeholder="Fullname" value=""/>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="password" id="password" placeholder="Password" value=""/>
                            <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="re_password" id="re_password" placeholder="Repeat your password" value=""/>
                        </div>
                        <input type="hidden" name="idR" id="idR" value="${idRole}">
                        <div class="form-group">
                            <input type="button" name="btnSubmit" id="btnSubmit" class="form-submit" value="Sign up"/>
                        </div>
                    </form>
	                    <p class="loginhere">
	                        Bạn đã có tài khoản chưa ? <a href="/dang-nhap" class="loginhere-link" style="text-decoration: none;">Đăng nhập</a>
	                    </p>
                </div>
            </div>
        </section>
    </div>

    <script type="text/javascript">
        
        $('#btnSubmit').click(function (e) { 
            e.preventDefault();
            var data = {};
            var username = $('#username').val();
            var fullname = $('#fullname').val();
            var password = $('#password').val();
            var re_password = $('#re_password').val();
            var idR = 2;
            data["username"] = username;
            data["fullname"] = fullname;
            data["password"] = password;
            data["idR"] = idR;
            if(username == "" || password == "" || re_password == "" || fullname == ""){
                window.location.href = "/dang-ki?lackOfInfo";
            } else if (password != re_password){
                window.location.href = "/dang-ki?not_equal";
            }else {
                $.ajax({
                    type: "POST",
                    url: "${APIuser}",
                    data: JSON.stringify(data),
                    contentType: "application/json",
                    dataType: "json",
                    success: function (data) {
                        window.location.href = "/dang-nhap";
                    },
                    error: function (data) { 
                        window.location.href = "/dang-ki?not_success";
                    }
                });
            }
        });
    </script>
</body>
</html>