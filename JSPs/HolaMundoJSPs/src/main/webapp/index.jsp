<%-- 
    Document   : index
    Created on : 23 dic. 2022, 10:11:08
    Author     : emers
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%-- Libreria jstl --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> <%-- Directiva page --%>
<!DOCTYPE html>
<html>
    <head>
        <title>HolaMundo JSPs</title>
    </head>
    <body>
        <h1>Hola Mundo JSPs!</h1>
        <ul>
            <li> <% out.print("HolaMundo con scriplets"); %> </li>
            <li> ${"HolaMundo con Expression Language (EL)"} </li>
            <li> <%= "HolaMundo con Expresiones" %> </li>
            <li> <c:out value="HolaMundo con JSTL" /> </li>
        </ul>
    </body>
</html>
