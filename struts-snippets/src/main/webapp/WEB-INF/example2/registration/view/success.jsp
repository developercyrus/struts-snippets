<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

    <jsp:useBean id="registerForm" class="example2.registration.model.RegisterForm" scope="session"/>
    Hi, <jsp:getProperty name="registerForm" property="username" /><br/> 
    Registration succeeded! <br/>   
    <a href="welcome.do">Try another?</a>

</body>
</html>