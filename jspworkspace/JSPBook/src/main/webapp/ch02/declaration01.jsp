<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag</title>
</head>
<body>
	<%--jsp�� html �� body�� (���� �ڹٹ������� �ؾ� ������ �ȳ�)�ڹٹ����� ������ �־ �������� ������ִ� �� --%>
	<%--�ش� ��������� int data�� ���𹮿� ���� ���������� �� --%>
	<%! int data = 50; %>
	<%
		out.println("Value of the variable is:" + data); //html�� ������ִ� ��
	%>
</body>
</html>