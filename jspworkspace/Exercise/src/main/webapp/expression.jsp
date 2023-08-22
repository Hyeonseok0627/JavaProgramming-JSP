<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag</title>
</head>
<body>
<%--Calendar은 new java.util.Calendar();처럼해서 못 불러오므로 ctrl+shift+'o'를 눌러서 import를 직접해와서 해당 클래스를 사용해야함 --%>
	<%= Calendar.getInstance().getTime().toString() %>
</body>
</html>