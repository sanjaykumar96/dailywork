<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

import="java.util.Date"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- declaring tag--->
<%!
 int requestcount=0;
%>
<!-- scriptlet tag -->
<%
requestcount++;
%>
<!-- expression tag -->
<h1>no of user visited....<%=requestcount %></h1>
<hr>
<!--   <h1>today date is<%=new java.util.Date() %></h1> -->
<h1>today date is<%=new Date() %></h1>
</body>
</html>