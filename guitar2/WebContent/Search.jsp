<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询吉他</title>
</head>
<body>
	<p ><font>请输入您想要查询的吉他属性条件</font></p>
	<form method="get"action="SearchServlet">
		<label><font>builder：</font></label><input type="text" name="builder"><br/> 
		<br> <label><font >model：</font></label><input type="text" name="model"><br/> 
		<br> <label><font >type：</font></label><input type="text" name="type"><br/>
		<br>  <label><font >backWood：</font></label><input type="text" name="bw"><br/>
		<br> <label><font>topWood：</font></label><input type="text" name="tw"><br/> 
		<br> <input type="submit" value="查询">
	</form>
</body>
</html>