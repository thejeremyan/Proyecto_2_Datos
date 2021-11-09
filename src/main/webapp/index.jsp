<%@ page import="tree.EncapsulationTree" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<style>
    table, th, td {
        border: 0px solid black;
        border-collapse: collapse;
    }

    table.center {
        margin-left: auto;
        margin-right: auto;
    }
    h1 {text-align: center;}
</style>
<body style="background-color:beige;">

<h1><%= "Calculadora" %></h1>
<table class="center">
    <th><p style="color:red">Ingrese la operacion que quiere calcular</p>
    <tr>
        <th><form action="${pageContext.request.contextPath}/calculadora">
        Operacion: <input type="text" name="operacion">
        <input type="submit" name="enviar" >
       </form>
</table>

<br/>
<table class="center">
        <tr>
            <th><form action="${pageContext.request.contextPath}/Historial">
                <input type="submit" name="Hist">
            </form>
</table>
</body>
</html>