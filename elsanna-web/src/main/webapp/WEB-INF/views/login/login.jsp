<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	<form action="/j_spring_security_check" method="post">
		<label for="j_username">로그인 ID</label>
		<input type="text" id="j_username" name="j_username" size="20" maxlength="20" />
		<br />
		<label for="j_password">비밀번호</label>
		<input type="password" id="j_password" name="j_password" size="20" maxlength="50" />
		<br />
		<input type="submit" value="로그인" />
	</form>
</body>
</html>