<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인생 사진</title>
</head>
<body>
	<h1> 추억이 담긴 나날들 </h1>	
	<form action = "choiceCha" method = "post">
		<input type="checkbox" name="cha" value="./images/2016.jpg"	/>2016Y
		<input type="checkbox" name="cha" value="./images/2017.jpg"	/>2017Y
		<input type="checkbox" name="cha" value="./images/2018.jpg"	/>2018Y
		<input type="checkbox" name="cha" value="./images/now.jpg"	/>current
		<br/><br/>
		<input type="submit" value="선택"/>
	</form>
</body>
</html>