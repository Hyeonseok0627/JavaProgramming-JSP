<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag</title>
</head>
<body>

	<%! String makeItLower(String data) {
		return data.toLowerCase(); //�ڹ��� �ش� �̷� �⺻ �޼���� ��밡��
	} %>
	
	Hello World�� �ҹ��ڷ� ǥ��<br>
	<%--��ũ��Ʋ��(java������ ������ ������ JSP Service() �޼��带 �����ϴ� ����) �ȿ��� �ڹٹ����� �ۼ��ؾ��ϸ�, �ڹٹ����� �ƴ� ������ ����ó�� ��ũ��Ʋ�� �ۿ� �ۼ��ؾ��� --%>
	<%
		out.println(makeItLower("Hello World"));
	%>
</body>
</html>