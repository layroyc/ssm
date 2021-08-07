<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		
	</style>
  </head>
  
  <body>
  <h2>业务详情</h2>
    业务序号：<input type="text" name="bId" name="bId"><br>
    排队号：<input type="text" name="bNum" name="bNum"><br>
    业务类型：<input type="text" name="bType" name="bType"><br>
    备注信息:<textarea rows="4" cols="30" name="bMark"></textarea><br>
    详情名称：<input type="text" name="bName"><br>
     办理人：<input type="text" name="bdPerson"><br>
   <input type="submit" value="确认添加">
   <!-- <a href="/ssmwy/business/select">确认添加</a> -->
 
      
  </body>
</html>
