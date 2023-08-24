<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
<%--java 클래스를 새로 생성한 후에 그것을 jsp에서 사용하는 경우엔 server restart를 해줘야 jsp에서 해당 클래스를 구현하여 웹브라우저에 반영됨 --%>
	<jsp:useBean id="bean" class="ch04.com.dao.Calculator" />
	<p>
	<%
	ch04.com.dao.Calculator bean2 = new ch04.com.dao.Calculator(); //이렇게 구현하는 것이랑 usebean 쓰는게 같은 결과값 다른 표현임
	bean2.process(5);
	 	int m = bean.process(5);
	 	out.print("5의 3제곱 : " + m);
	 %>
	 </p>
</body>
</html>