<%-- 
    Document   : muestraResultado
    Created on : Jun 11, 2024, 8:33:55 PM
    Author     : marua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Suma"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1>Resultado de la Suma</h1>
    <p>La suma es: ${sumaResuelta.resultado}</p>
    <br>
    <a href="index.jsp">Realizar otra suma</a>
</html>