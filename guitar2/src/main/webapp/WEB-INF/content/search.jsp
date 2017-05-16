<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
 <!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>查询吉他</title>
</head>
<body>
	<form role="form" action="search_s" method="post">
		BUILDER<br><input type="text" name="builder"><br> 
		MODEL<br></font></label><input type="text" name="model"><br> 
		TYPE<br></font></label><input type="text" name="type"><br>
		BACKWOOD<br></font></label><input type="text" name="backWood"><br>
		TOPWOOD<br></font></label><input type="text" name="topWood"><br> 
		 <label hidden><font color='white'>numString</font></label><input hidden  type="text" name="numStrings" value= "6"><br/> 
		 <input type="submit" value="查询">
	</form>
 
</body>