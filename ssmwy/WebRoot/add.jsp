<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<style type="text/css">
label {
	color: red;
}

select {
	width: 150px;
	height: 30px;
}
</style>
</head>

<body>
	<h3>新增业务</h3>
	<form action="/ssmwy/business/add" onSubmit="return beforeSubmit(this);" name="form">
		业务类型:<select name="bType">
			<option>信用卡</option>
			<option>现金业务</option>
			<option>开户</option>
			<option>转账业务</option>
		</select><br> 
	排队号：<input type="text" name="bNum" value="" id="put"><br>
		备注信息:
		<textarea rows="4" cols="30" name="bMark"></textarea>
		<br> <input type="submit" value="确认添加">
	</form>
	<script type="text/javascript">
     $('#put').blur(function () {
        this.style.borderColor = this.value == '' ? 'red' : 'green';
    }); 
    function beforeSubmit(form){
		if(form.bNum.value==''){
		alert('排队号不能为空！');
		form.bNum.focus();
		return false;
		}
		return true;
		}
    </script> 
</body>
</html>
