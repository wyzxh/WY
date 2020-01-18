<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
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
  <table>
  		<tr>
  			<td>商品名称:</td>
  			<%// <td>商品编号:</td>%>
  			<td>会员特价:</td>
  			<%//<td>普通价格:</td> %>
  		</tr>
  	<c:forEach items="${list}" var="shangpin">
  		<tr>
  			<td>${shangpin.name}</td>
  			<%//<td>${shangpin.id}</td> %>
  			<td>${shangpin.huiyuan}</td>
  			<%-- <td>${shangpin.putong}</td> --%>
  			<td><a href="<%=path%>/servlet/ShanchuGWC?id=${shangpin.id}">从购物车移除此商品</a></td>
  			
  		
  	</c:forEach>
  	
  	
  	
  	</table>
  	<a href="<%=path %>/servlet/Shangpin">返回商品页面</a>
  </body>
</html>
