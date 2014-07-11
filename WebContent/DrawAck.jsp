<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Game.*" import="java.util.*" %>

<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tie</title>
</head>
<body>


<center>
<h2>Tie</h2>

<img src="lose_win_dice.jpg" alt="Tied"/><br>

<s:set name="DataBeanSession" value="#session.DataBeanSession" />

You : <s:property value="#DataBeanSession.userChoice" /><br>
Server : <s:property value="#DataBeanSession.serverChoice" />
<br>

<a href="<s:url action="index1"/>"> Play again </a>

</center>

</body>
</html>