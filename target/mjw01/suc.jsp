<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>华软金科-统一登录平台</title>

<style type="text/css">
body{ text-align:center; vertical-align:middle; } 
</style>

<style type="text/css">
.td1{text-align:left; }
</style>

</head>

<body background="img/1.jpg">

<%
	String  kk=(String)session.getAttribute("user");
%>
 
<div style="width:20%; height:100%; background-color:#234; z-index:1;padding-left:0px; ">
<td  style="padding-left:100px;"><font color="RED">欢迎:阳光保险登录演示环境:</font><font color="#cf0cf9"> <%=kk %></font>  &nbsp; <a href="index.jsp" target="_top" "><font color="#FFFFFFFF">    退出</font></a></td>

</div>
<tr valign="center"><BR><BR>
<td align="center"  ><center><font color="RED" size="5" >演示系统列表20190226</font></center></td>
<br> 
<table align="center" width="60%" border="0px" bgcolor="#eeeeee" cellpadding="3" >
<tr bgcolor="#CFFFF0"><td>系统名称</td><td>描述</td></tr>
<tr ><td align="left"><a href="https://dop.poc.qloudmart.com"  target="frame1">QloudDOP</a></td><td class="td1" colspan='0' style='word-wrap: break-word' width="120"><font size="2">QloudDOP系统，团队可以更快，更高效和更好地交付应用程序.这里有你的计划，监控，开发和协作您的软件项目.</font></td></tr><br>
<tr><td class="td1" width="20%"><a href="http://qloudtcms.service.sd">QloudTest</a></td><td class="td1"><font size="2">华软科技测试案例管理系统地址</font></td></tr>
<tr><td class="td1"><a href="https://114.115.132.40:8443">Market</a></td><td class="td1"><font size="2">Market:华软科技简融市场体验区</font></td></tr>
<tr><td class="td1"><a href="">AutoTest</a></td><td class="td1"><font size="2">AutoTest:华软科技研发的自动化测试工具，可以通过该工具编写、执行自动化接口、UI测试案例等等</font></td></tr>
</table>
</tr>
</body>
</html>
