<%-- 
    Document   : scriptlets
    Created on : 23 dic. 2022, 17:21:28
    Author     : emers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriplets</title>
    </head>
    <body>
        <h1>JSP con Scriplets</h1>
        <%-- Scriplet para enviar informacion al navegador --%>
        <%
            out.print("Saludos desde un sprintlet");
        %>
        <br>
        <%-- Scriplet para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%-- Scriplet con codigo condicionado --%>
        <%
            if (session != null && session.isNew()) {
        %>
        La sesion SI es nueva!
        <%
        } else if (session != null) {
        %>
        La sesion NO es nueva.
        <% }%>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
