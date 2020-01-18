<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addmassger.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form action="<%=path %>/servlet/Message" method="post">
      <% 
  request.setCharacterEncoding("utf-8");
  %>	
    姓名:<input type="text" name="name">
    性别:<select name="sex">
    <option value="1">男</option>
    <option value="2">女</option>
    </select><br>
   年龄:<input type="text" name="age"> 
  手机号:<input type="text" name="phone"><br>
  <input type="submit"value="保存信息"> 
  <a href="<%=path%>/servlet/getallxinxi" >已有信息，点击查看</a>
  </form>
  </body> 
</html>
