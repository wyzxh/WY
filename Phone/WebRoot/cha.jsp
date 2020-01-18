<%@ page language="java" import="java.util.*,java.text.SimpleDateFormat" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'cha.jsp' starting page</title>
    
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
  <script  type="text/javascript">
  	setTimeout("location.href='index.jsp'",15000)
  </script>
<%
int pageno=Integer.parseInt(request.getAttribute("pageno").toString());
int pagecount=Integer.parseInt(request.getAttribute("pagecount").toString());
String str="";
str="red";

 %>
  <font color="<%=str%>">超市会员信息管理系统:</font><br>
  <input type="button" value="返回添加用户界面" onclick="location='/Phone/addmassger.jsp'">
  
   <%
	  Date time = new Date();
	  SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  out.print("北京时间:" + date.format(time));
	 
	  
   %>
   <a href="<%=path%>/servlet/Shangpin">会员特价商品列表</a>
  	<table>
  	<tr>
  	<td>会员编号:</td>
  	<td>姓名:</td>
  	<td>年龄:</td>
  	<td>手机号:</td>
  	</tr>
  <c:forEach items="${list}" var="xin">
  	<tr>
		<td>${xin.id}</td> 	
  		<td>${xin.name}</td>
  		<td>${xin.age}</td>
  		<td>${xin.phone}</td>
  		<td><a href="<%=path%>/xiugai.jsp?id=${xin.id}">修改会员个人信息</a></td>
  		<td><a href="<%=path%>/servlet/Deleta?id=${xin.id}"onclick="if(confirm('确定删除'+'${xin.name}'+'吗？')==false)return false">太久未购物,删除信息</a></td>
  	</tr>
  </c:forEach>
  </table>
   <div>
   <p>一共${datacount}条数据,每页显示${pagesize}条数据</p>
  <a href="http://www.baidu.com" >百度一下</a>
	<%
		if (pageno > 1) {
	%>
		<a href="<%=path%>/servlet/getallxinxi?pageno=1">首页</a>
		<a href="<%=path%>/servlet/getallxinxi?pageno=${pageno-1}">上一页</a>
		
		<%
					}
					if (pageno < pagecount) {
				%>
		<a href="<%=path%>/servlet/getallxinxi?pageno=${pageno+1}">下一页</a>
		<a href="<%=path%>/servlet/getallxinxi?pageno=${pagecount}">尾页</a><br><br>
		
		<%
					}
				%>
		 
	</div>
	<a href="<%=path %>/xitong.jsp">退回系统页面</a>
  </body>
  
</html>
