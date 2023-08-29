<%--�ؿ� �ִ� �� ��Ƽ�� �±� ����
�±� �ȿ� ���� �ۼ����� html �ۼ����� �Ӽ�����="�̸�" �̷� ������� �ۼ��ϰ� �� ĭ ���� ���� ���� �߰��ۼ� --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Welcome</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<%--<!-- -->�ش� �ּ����� �� ������ F12Ű �ҽ� �ڵ忡���� ��Ÿ��--%>
<%-- �׷��� ������ jsp������ jsp �ּ����� ����������--%>
<!-- 	<nav class = "navbar navbar-expand navbar-dark bg-dark">
		<div class = "container">
			<div class = "navbar-header">
				<a class = "navbar-brand" href="./welcome.jsp">Home</a>
			</div>
		</div>
	</nav> -->
<%@ include file = "menu.jsp" %>
<%!
	String greeting = "���� �� ���θ�";
	String tagline = "Welcome to Web Market!";
%>

	<div class = "jumbotron">
		<div class = "container">
			<h1 class = "display-3">
				<%= greeting %>
			</h1>
		</div>
	</div>
	
	<div class = "container">
		<div class = "text-center">
			<h3>
				<%= tagline %>
			</h3>
			<%
				response.setIntHeader("Refresh" , 1); //176������ ���� �߰��� �κ�
				Date day = new java.util.Date();
				String am_pm;
				int hour = day.getHours();
				int minute = day.getMinutes();
				int second = day.getSeconds();
				if (hour / 12 == 0) {
					am_pm = "AM";
				} else {
					am_pm = "PM";
					hour = hour - 12;
				}
				String CT =  hour + ":" + minute + ":" + second + " " + am_pm;
				out.println("���� ���� �ð�: " + CT + "\n");
			%>
			<hr>
		</div>
	</div>
	
<!-- 	<footer class = "container">

	</footer> -->
<%@ include file = "footer.jsp" %>
</body>
</html>