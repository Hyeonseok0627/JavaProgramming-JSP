<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag</title>
</head>
<body>

	<%
		String date = new java.util.Date().toLocaleString();//toLocaleString: ToDay : 2023. 8. 23. ���� 9:32:35 �̷������� �ѱ��ð�ǥ������ ��Ÿ��
		out.println("ToDay : " +date);
	%>
	<%--������ �� �ٸ� �ڵ��� --%>
	<%--<% java.util.Date date = new java.util.Date();//util�� import�����ʰ� �ҷ����� ��
		out.print("Today : " + date);
	%>--%>
</body>
</html>