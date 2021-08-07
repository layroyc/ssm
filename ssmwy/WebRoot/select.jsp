<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

table {
	margin: 0 auto;
	border-collapse: collapse;
	width: 50%;
	text-align: center;
} 
  

td {
	border: 2px solid red;
	text-align: center;
	height: 30px;
}
</style>
</head>

<body>
	<h1 align="center">业务列表</h1>
	<table style="border: 1px solid red;" id="a">
		<tr>
			<td>业务序号</td>
			<td>排队号</td>
			<td>业务类别</td>
			<td>备注信息</td>
			<td>详情编号</td>
			<td>详情名称</td>
			<td>办理人</td>
			<td>操作内容</td>
		</tr>
		<c:forEach items="${sessionScope.list }" var="s">
			<tr>
				<td>${s.bId}</td>
				<td>${s.bNum}</td>
				<td>${s.bType}</td>
				<td>${s.bMark}</td>
				<td></td>
				<td></td>
				<td></td>
				<td>
				<a href="/ssmwy/yw.jsp">办理业务</a>
				<a href="/ssmwy/business/del?bId=${s.bId }">删除业务</a>
				</td>
			</tr>

		</c:forEach>
		<tr>
			<td colspan="8"><a href="/ssmwy/add.jsp">新增业务</a></td>

		</tr>
	</table>
</body>
</html>
