<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎内测用户盛老师</title>
    
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
  <%String str="";
  str="red";
   %>
  <center>
  <h1>
    <br><br><br><br><br><br>
    <font color="<%=str%>">欢迎来到超市管理系统</font><br><br>
    <a href="<%=path%>/index.jsp">进入系统</a><br><br>
    <a href="<%=path%>/jujue.jsp">我再想想</a>
     </h1>
    </center>
  </body>
</html>
