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
<%--getInstance�� ������ Calendar Ŭ���� ���� ��쿣 �ش� ������ ���� �ٸ� ��ü���� ������ ���� �������ϹǷ�, �̱��� ������ ����Ͽ�
�ν��Ͻ��� ���� �ϳ��� �������ְ�, ���Ӱ� �ν��Ͻ��� ������ �ʰ� �ش� �ν��Ͻ��� �׳� ���� �ϱ����� ���� ��, �׷��� new�� �����ʰ� getInstance() �޼��带 �Ἥ ������ ��
�׷��� Date Ŭ�����ʹ� �ٸ��� Calendar�� �̱��� �����̶� import���ְ� getInstance() �޼��带 �ٿ��༭ �ش� �ν��Ͻ��� �״�� �����޾Ƽ� ���   --%>
<%--getInstance(): �̱����������� ������ ������� �ν��Ͻ��� ������ ���� ��, getTime(): �ð��� ������ ���� ��, toString(): ���ڿ��� ��ȯ --%>
	<%= Calendar.getInstance().getTime().toString() %>
	<%--���� ����� ���� import������ϰ�, �ؿ� ����� ���� import���� �ܺ� �ڹ� Ŭ������ ������ ���� ��� --%>
	<%= java.util.Calendar.getInstance().getTime().toString() %>
</body>
</html>