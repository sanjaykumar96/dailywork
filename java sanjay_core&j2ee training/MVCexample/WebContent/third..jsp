<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--for session expiration automatic --%>
<%
response.setIntHeader("refresh",12);
%>
<h1>From third.jsp page</h1>
<jsp:useBean id="ref" class="com.cts.bean.LogicBean" scope="session"/>
<jsp:getProperty property="userName" name="ref"/>
<jsp:getProperty property="password" name="ref"/>

</body>
</html>