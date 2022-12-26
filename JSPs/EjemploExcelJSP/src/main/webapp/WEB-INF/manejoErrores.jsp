<%-- 
    Document   : manejoErrores
    Created on : 26 dic. 2022, 9:38:47
    Author     : emers
--%>

<%@page isErrorPage="true"%>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de Errores</title>
    </head>
    <body>
        <h1>Manejo de Errores!</h1>
        <br/>
        Ocurrio una excepcion: <%= exception.getMessage()%>
        <br/>
        <textarea cols="30" rows="10">
            <% exception.printStackTrace(new PrintWriter(out));%>
        </textarea>
    </body>
</html>
