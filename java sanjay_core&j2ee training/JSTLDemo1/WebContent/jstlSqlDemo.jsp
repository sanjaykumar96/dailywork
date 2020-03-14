<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource
user="root"
password="root"
url="jdbc:mysql://localhost:3306/ctspune"
driver="com.mysql.jdbc.Driver"

/>
<%-- <sql:update>
  insert into employee values(15,'naveen','bhopal',25,8871504617) 

</sql:update> --%>
<!--  -->
<sql:query var="rs" sql="select *from employee"></sql:query>
 <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of employee</h2></caption>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>address</th>
                <th>age</th>
                <th>phone</th>
            </tr>
            <c:forEach var="user" items="${rs.rows}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.address}" /></td>
                    <td><c:out value="${user.age}" /></td>
                    <td><c:out value="${user.phone}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
<%--  <c:forEach var="row" items="${rs.rows}">
<c:out value="${row.id}"/>
<c:out value="${row.name}"/>
<c:out value="${row.address}"/>
<c:out value="${row.age}"/>
<c:out value="${row.phone}"/> 
</c:forEach> --%>
</body>
</html>