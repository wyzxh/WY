<%@page import="com.impl.SpServersimpl"%>
<%@page import="com.servers.ShangpinServers"%>
<%@page import="com.entity.Shangpin"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'XiugaiShangpin.jsp' starting page</title>
    
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
   Shangpin sp=new Shangpin();
   sp.setId(Integer.parseInt(id));
  ShangpinServers ss=new SpServersimpl();
  Shangpin newss=ss.gai(sp);
  request.setAttribute("newss", newss);
   %>
  </head>
  
 
  <body>
  <form action="<%=path %>/servlet/XiugaiShangpin?id=${newss.id}" method="post">
  商品名称:<input type="text" name="name" value="${newss.name}">
  会员特价:<input type="text" name="dazhe"><br>
  普通价格:<input type="text" name="yuanjia">
  <input type="submit" value="修改完成" >
  </form>
  </body>
</html>
