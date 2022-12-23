<%-- 
    Document   : procesaFormulario
    Created on : 23 dic. 2022, 11:05:48
    Author     : emers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesar formulario</title>
    </head>
    <body>
        <h1>Resultado de procesar el formulario</h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br>
        Password: <%= request.getParameter("password") %>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
