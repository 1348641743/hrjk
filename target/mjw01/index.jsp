<%@ page language="java" contentType="text/html; charset=utf-8"

pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>登录界面</title>
</head>

<body  background="img/1.jpg"> 


<center>

<br><br><br><br><br><br>

<h1 style="color:#cffcf0">用户登录</h1>

<%
	String msg="";
	String  kk=(String)session.getAttribute("message");
	if (kk!=null)
	{
		 msg=kk;
	}
	session.setAttribute("message", null);
%>
<td align="center" ><font color="Red" size="2"><%= msg %></font></td>
<br>

<form action="DemoServlet">

<table Border="0" >

<tr >

<td><font size="4" >账号: </</font></td>

<td><input type="text" name="user" size="25" height="22"></td>

</tr>

<tr>

<td>密码:  </td>

<td><input type="password" name="pass" size="25">

</td>

</tr>

</table>

<br>

<input type="submit" value="登录" style="color:#BC8F8F">

</form>

</center>

</body>

</html>