<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<h3> 회원 가입 </h3>
	
	<form action="join" method="post">
		<b>아이디 : </b><input type = "text" name="id" required ="required"><br/>
		<b>비밀번호 : </b><input type = "password" name="pw" required ="required"><br/>
		<b>비밀번호 확인 : </b><input type = "password" name="pwconfirm" required ="required"><br/>
		
		
		<b>취미</b><input type="checkbox" name="hobby" value="read"/>독서&nbsp;&nbsp;
				  <input type="checkbox" name="hobby" value="cook"/>요리&nbsp;&nbsp;
				  <input type="checkbox" name="hobby" value="run" />조깅&nbsp;&nbsp;
				  <input type="checkbox" name="hobby" value="swim"/>수영&nbsp;&nbsp;
				  <input type="checkbox" name="hobby" value="sleep"/>낮잠&nbsp;&nbsp;
				  <br/>				  			
		<b>전공</b><input type="radio" name="major" value="kor" checked="checked"/>국문과&nbsp;&nbsp;
				  <input type="radio" name="major" value="eng"/>영문과&nbsp;&nbsp;
				  <input type="radio" name="major" value="math"/>수학과&nbsp;&nbsp;
				  <input type="radio" name="major" value="des"/>디자인과&nbsp;&nbsp;
				  <input type="radio" name="major" value="Com"/>컴퓨터과&nbsp;&nbsp;	
				  <br/>
		<b>학부</b>&nbsp;&nbsp;
		<select name="college">
		<option value="info" selected="selected">정보통신학부</option>
		<option value="human" selected="selected">인문학부</option>
		<option value="teach" selected="selected">사범대학부</option>
		<option value="design" selected="selected">디자인학부</option>		
		</select>
		<br/><br/>
		<button> 확인 </button>
		<button>취소</button><br/>
	</form>

</body>
</html>