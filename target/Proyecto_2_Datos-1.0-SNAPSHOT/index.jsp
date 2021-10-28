<%@ page import="tree.EncapsulationTree" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>

<table>
    <form action="${pageContext.request.contextPath}/hello-servlet">
        Operacion: <input type="text" name="operacion">
        <input type="submit" name="enviar">
    </form>
</table>

<br/>

</body>
</html>