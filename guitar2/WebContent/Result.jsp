<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.guitar2.util.DBUtil" %>
<%@ page import="com.guitar2.model.*" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询结果</title>
</head>
<body>
<br>
<br>
<br>
<font >查询结果：</font>
<table style="text-align:center ;" border="0" bgcolor="#FFF5EE">
<br>
<thead>
<tr>
<th style="width:80px;">serialNumber:</th>
<th style="width:80px;">price</th>
<th style="width:80px;">builder</th>
<th style="width:80px;">model</th>
<th style="width:80px;">type</th>
<th style="width:80px;">backWood</th>
<th style=";width:80px;">topWood</th>
</tr>
</thead>
<tbody>
	<% 
		Inventory inventory = new Inventory();
		inventory = (Inventory)request.getAttribute("result");
		List guitars = new ArrayList();
		guitars = inventory.getGuitars();
		System.out.print(guitars.size());
		if(guitars.size()>0){
		Iterator i = guitars.iterator();
		while(i.hasNext()){
			Guitar guitar = (Guitar) i.next();
		 %>
		 <tr  > <td > <%=guitar.getSerialNumber() %> </td>
		  <td> <%=guitar.getPrice() %></td>
		 <td><%=guitar.getGuitarSpec().getBuilder() %></td>
		 <td><%=guitar.getGuitarSpec().getModel() %></td>
		 <td><%=guitar.getGuitarSpec().getType() %></td>
		  <td><%=guitar.getGuitarSpec().getBackWood() %> </td>
		 <td> <%=guitar.getGuitarSpec().getTopWood() %> </td> </tr>
		 <%}%>	
		 <%}else{%>
		<font>您查询的结果不存在，请核实后重新查找！</font>
		<% 	}%>
	</tbody>
</table>
</body>
</html>