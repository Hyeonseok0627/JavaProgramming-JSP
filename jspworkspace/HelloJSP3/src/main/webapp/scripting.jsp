<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting tag</title>
</head>
<body>

	<h2>Scripting tag</h2>
	
	<%--<%! ���� %> --%>
	<%! int count = 3;
		String makeItLower(String data) {
			return data.toLowerCase();
		}
	%>
	
	<%--<% ��ũ��Ʋ�� : �ڹ� ������(�޼��� ���� �����κ�), ���๮ %> --%>
	<% for (int i=1; i<=count; i++) {
		out.println("Java Server Pages " + i + ".<br>");
		}
	%>
	
	<%--<%=������(��Ŭ��Ʋ������ ���� �������̳� ���๮�� �Ķ���͸� �ְ� �����ϴ� ����� ������ �κ�) %> --%>
	<%=makeItLower("Hello World")%>
	
</body>
</html>