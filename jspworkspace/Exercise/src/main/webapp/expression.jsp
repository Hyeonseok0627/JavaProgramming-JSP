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
<%--Calendar�� new java.util.Calendar();ó���ؼ� �� �ҷ����Ƿ� ctrl+shift+'o'�� ������ import�� �����ؿͼ� �ش� Ŭ������ ����ؾ��� --%>
	<%= Calendar.getInstance().getTime().toString() %>
</body>
</html>