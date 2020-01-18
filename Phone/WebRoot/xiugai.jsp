<%@page import="com.entity.Xinxi"%>
<%@page import="com.impl.Serversimpl"%>
<%@page import="com.servers.RegisterServes"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'xiugai.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <%
	String id=request.getParameter("id");
	RegisterServes ri=new Serversimpl();
	Xinxi xx=new Xinxi();
	xx.setId(Integer.parseInt(id));
	Xinxi newxx=ri.update(xx);
	request.setAttribute("newxx", newxx);
	 %>
  </head>
  
  <body>
 	<form action="<%=path%>/servlet/Update?id=${newxx.id}" method="post">
  	姓名:<input type="text" name="name" value="${newxx.name}">
  	年龄:<input type="text" name="age"><br><br>
  	手机:<input type="text" name="phone">
  	<input type="submit"value="保存数据，修改完成">
	</form>  
  </body>
</html>
