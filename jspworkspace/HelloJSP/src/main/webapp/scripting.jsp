<%-- �ش� ���� ������ �ִ� ��ġ : --%>
<%-- C:\Users\it\Documents\JavaProgramming_git\jspworkspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\HelloJSP3\org\apache\jsp --%>
<%-- jsp�� ���� ���� �ش� �������� java Ȯ���� ������ ����� �̷��� �ڵ������� �ڹ����Ϸ� �����Ǿ����� --%>
<%-- ��� java���Ϸ� ǥ���� �Ǵ��� �˰� �־�� jsp ǥ������ <% %> �̰��� ����� --%>

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
	<%!
		//���� : Ŭ���� ���� �ٷ� �Ʒ��� ����, ���� ���� ��쿣 ����������, �޼��� ���� ����
		int count = 3;
		String makeItLower(String data) {
			return data.toLowerCase();
		}
	%>
	
	<%--<% ��ũ��Ʋ�� : �ڹ� ������(�޼��� ���� �����κ�), ���๮ %> --%>
	<% 
		// ��ũ��Ʋ�� : _JSP Service() �ż��� �ȿ��� �����
		for (int i=1; i<=count; i++) {
		out.println("Java Server Pages " + i + ".<br>");
		}
	%>
	
	<%--<%=������(��Ŭ��Ʋ������ ���� �������̳� ���๮�� �Ķ���͸� �ְ� �����ϴ� ����� ������ �κ�) %> --%>
	<%-- ǥ���� : out.println() ��ȣ �ȿ��� ���� -> �����ݷ�(;) ��������  --%>
	<%=makeItLower("Hello World")%><!--makeItLower: �빮�ڸ� �ҹ��ڷ� ��������, ;�� �ʿ���� �׳� ���븸 ������ ��  -->
</body>
</html>