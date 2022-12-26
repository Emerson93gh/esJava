<%-- 
    Document   : recursoPrivado
    Created on : 26 dic. 2022, 11:09:45
    Author     : emers
--%>

<%
    String colorFondo = request.getParameter("colorFondo");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="<%= colorFondo %>">
        
    </body>
</html>
