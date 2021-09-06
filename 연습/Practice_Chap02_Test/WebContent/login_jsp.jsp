<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css"> /*아니디 선택자 == # 클래스 선택자 == . */
		#loginFormArea{
		text-align : center;
		width : 250px;
		margin : auto;
		border: 1px solid black;
	}
	
	h1 {
		text-align: center;
		color: blue;
	}


</style>
</head>
<body>
	<h1>로그인</h1>
	
	<section id = "loginFormArea"> <!-- section영역의 id를 loginFormArea로 지정함 -->
		<form action="login" method="post"> 
		<br/>
			<label> 아이디 : </label> 
			<!-- required속성은 반드시 입력하시오라는 속성 -->
			<input type="text" name = "id" required="required"/>
			<br/><br/>
			<label> 이름 : </label> 
			<input type="text" name = "name" required="required"/>
			<br/><br/>
			<label> 비밀번호 : </label> 
			<input type="password" name = "pw" required="required"/>
			<br/><br/>
			<input type="submit" value="로그인"/>	
		</form>	
	</section>
</body>
</html>