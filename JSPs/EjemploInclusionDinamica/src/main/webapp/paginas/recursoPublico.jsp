<%-- 
    Document   : recursoPublico
    Created on : 26 dic. 2022, 11:08:50
    Author     : emers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br/>
        Inclusion de Contenido Dinamico desde un JSP publico
        <br/>
        Nombre de aplicacion: <%= request.getContextPath() %>
    </body>
</html>
