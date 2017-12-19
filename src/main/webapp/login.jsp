<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ashleycano
  Date: 12/19/17
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<c:if test="${request.getParameter('username').equals('admin')}">--%>
    <%--<h2><%= request.getParameter("username")%></h2>--%>
<%--</c:if>--%>

<%

    if ("admin".equals(request.getParameter("username")) && "password".equals(request.getParameter("password"))) {
        response.sendRedirect("/profile.jsp?" + request.getParameter("username"));
//        out.println("<h1>" + request.getParameter("username") + "</h1>");
    }

%>

<h1></h1>

<form action="/login.jsp" method="POST">
    <label for="username">Username</label>
    <input id="username" name="username" type="username" placeholder="Enter your Username">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password" placeholder="Enter your password">
    <br><br>

    <button type="submit">Login</button>
</form>


<script>


</script>
</body>
</html>
