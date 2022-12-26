<%-- 
    Document   : index
    Created on : 26 dic. 2022, 10:24:14
    Author     : emers
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclusion Estatica</title>
    </head>
    <body>
        <h1>Ejemplo Inclusion Estatica</h1>
        <br/>
        <ul>
            <li>
                <%@include file="paginas/noticias1.html" %>
            </li>
            <li>
                <%@include file="paginas/noticias2.jsp" %>
            </li>
        </ul>
        <%-- Solo se genera un JSP, de index con sus includes, durante la traduccion --%>
    </body>
</html>
