<%@page import="com.entity.Shangpin"%>
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
    
    <title>My JSP 'shangpin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%
	int pageno=Integer.parseInt(request.getAttribute("pageno").toString());
	int pagecount=Integer.parseInt(request.getAttribute("pagecount").toString());
 %>
  </head>
  
  <body>
  <input type="button" value="添加新的商品信息" onclick="window.location='/Phone/addSp.jsp'">
  	<table>
  		<tr>
  			<td>商品名称:</td>
  			<td>商品编号:</td>
  			<td>会员特价:</td>
  			<td>普通价格:</td>
  		</tr>
  	<c:forEach items="${list}" var="shangpin">
  		<tr>
  			<td>${shangpin.name}</td>
  			<td>${shangpin.id}</td>
  			<td>${shangpin.dazhe}</td>
  			<td>${shangpin.yuanjia}</td>
  			
  			<td><a href="<%=path %>/XiugaiShangpin.jsp?id=${shangpin.id}">修改商品信息</a></td>
  			<td><a href="<%=path %>/servlet/Shanchushangpin?id=${shangpin.id}"onclick="if(confirm('确定删除'+'${shangpin.name}'+'吗？')==false)return false">删除商品</a></td>
  			<td><a href="<%=path %>/servlet/Gouwuche?id=${shangpin.id}">添加进购物车</a>
  		</tr>
  	</c:forEach>
  	</table>
  	<p>一共${datacount}条数据,每页显示${pagesize}条数据</p>
  	<%
  	if(pageno>1){
  	 %>
  	 <a href="<%=path %>/servlet/Shangpin?pageno=1">首页</a>
  	 <a href="<%=path%>/servlet/Shangpin?pageno=${pageno-1}">上一页</a>
  	 <%
  	 }
  	 if(pageno<pagecount){
  	  %>
  	  <a href="<%=path %>/servlet/Shangpin?pageno=${pageno+1}">下一页</a>
  	  <a href="<%=path %>/servlet/Shangpin?pageno=${pagecount}">尾页</a><br><br>
  	  <%
  	  }
  	   %>
  	   <a href="<%=path %>/servlet/ShouGWC">购物车信息</a>
  	   <a href="<%=path %>/servlet/getallxinxi">返回客户信息列表</a>
  </body>
</html>
