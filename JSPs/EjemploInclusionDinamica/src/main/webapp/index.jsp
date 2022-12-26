<%-- 
    Document   : index
    Created on : 26 dic. 2022, 11:08:14
    Author     : emers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de Inclusion Dinamica</title>
    </head>
    <body>
        <h1>Ejemplo de Inclusion Dinamica</h1>
        <br/>
        <jsp:include page="paginas/recursoPublico.jsp"/>
        <br/>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="Yellow"/>
        </jsp:include>
        <%-- Cada inclusion dinamica genera su propio JSP y combinan la salida de index --%>
    </body>
</html>
