<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Welcome</title>
<%--��Ʈ��Ʈ�� Ȱ�� --%>
<%--���ۿ��� ��Ʈ��Ʈ�� �˻� -> ����Ʈ ���� �� �ش� ����(4.0)(4.0�������� �� ������ å ����� ���� �ϱ����� �� ���̰�, ���������� �� ���� �ֽŹ����� 5.3���� �ص���) �ٿ�ε�
-> �ش� ���� ���� Ǯ�� css, js ������ ���� -> �ش� ������ ����� jsp ������ �ִ� ������Ʈ �� webapp ������ �ֱ�
-> ��Ʈ��Ʈ�� Ȩ���������� css �κ��� cdm(��ũ�ּ�)�� �����ؼ� �Ʒ�ó�� <link>�� ������ �ش� css�������� ���� ������ ���� �� -> ���Ŀ� �ؿ�ó�� ���ϴ� ������� css���� �ڵ�¥�� ��Ʈ��Ʈ���ŷ� ����
, js�� cdm���� link�� �����ϸ� ��밡�� / ���� vscode���� css ���� ���� ��ũ ������ �Ͱ� �Ȱ��� ����
�̷��� Ȱ���ϸ� css, js ���� �ȸ���� �̹� ������� �ִ� ���� Ȱ���� �� ����--%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<nav class = "navbar navbar-expand navbar-dark bg-dark">
		<div class = "container">
			<div class = "navbar-header">
				<a class = "navbar-brand" href="./welcome.jsp">Home</a>
			</div>
		</div>
	</nav>
<%!
	String greeting = "Welcome to Web Shopping Mall";
	String tagline = "Welcome to Web Market!";
%>
<%--"jumbotron ���� ��쿣 4.0�������� ������, 5.3�������� ���� / �̰�ó�� �������� �ְ���� �־ �װ� ����Ͽ� ����Ȱ�� --%>
<%--�𸣴� �κ��� ������ ��Ʈ��Ʈ������ �˻��ؼ� �� �κк��鼭 css,js �ٽ� �����ϱ�--%>
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
		</div>
		<%--<hr>:���� ��Ÿ��--%>
		<hr>
	</div>
	<footer class = "container">
	<%--&copy: �� ���������� c��� ī�Ƕ����� �κ�ó�� ������ �� ���� ǥ�� --%>
		<p>&copy; WebMarket</p>
	</footer>
</body>
</html>