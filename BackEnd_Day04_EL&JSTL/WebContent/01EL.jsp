<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EL</title>
</head>
<body>
	<% out.print("Hello"); %>
	<%= "Hello" %>
	
	���ڿ�: ${"Hello" }<br>
	������: ${10 }<br>
	�Ǽ���: ${10.4 }<br>
	����: ${true }<br>
	null: ${null }<br>
	
</body>
</html>