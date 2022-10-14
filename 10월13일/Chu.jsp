<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="Mypack.WeightCount" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<input>
	</form>

<%
	WeightCount wc = new WeightCount(31);
%>
결과 : <%= wc.result() %>
<br>
<%
	WeightCount wc1 = new WeightCount();
%>
결과 : <%= wc1.result(31) %>

</body>
</html>