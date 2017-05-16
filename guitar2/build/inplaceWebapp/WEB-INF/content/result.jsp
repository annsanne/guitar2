<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
 <%@ taglib prefix="s" uri="/struts-tags" %>
  <!DOCTYPE HTML>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>查询结果</title> 
</head>
<body>
     <table class="table" border=1>
        <thead>
            <tr>
                <td>serialNumber</td>
                <td>price</td>
                <td>builder</td>
                <td>model</td>
                <td>type</td>
                <td>backWood</td>
                <td>topWood</td>
            </tr>
        </thead>
        <tbody>
        <s:iterator var='List' value="#request.List" >
        	<tr>
	            <td><s:property value="#List.serialNumber"/></td>
	            <td><s:property value="#List.price"/></td>	            
	            <td><s:property value="#List.spec.builder"/></td>
	            <td><s:property value="#List.spec.model"/></td>
	            <td><s:property value="#List.spec.type"/></td>
	            <td><s:property value="#List.spec.backWood"/></td>
	            <td><s:property value="#List.spec.topWood"/></td>
            </tr>
         </s:iterator>
        </tbody>
    </table>

					   
</body>