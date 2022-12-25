<%-- 
    Document   : index
    Created on : 25 dic. 2022, 16:02:18
    Author     : emers
--%>

<%-- Agregamos una declaracion de jsp --%>
<%! 
    // declaramos variable con su metodo get
    private String usuario = "Alexander";
    public String getUsuario() {
        return this.usuario;
    }
    // decalaramos una variable para contador de visitas
    private int contadorVisitas = 1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones con JSP</title>
    </head>
    <body>
        <h1>Uso de declaraciones con JSP</h1>
        Valor de usuario por medio del atributo: <%= this.usuario %>
        <br>
        Valor del usuario por medio del metodo: <%= this.getUsuario()%>
        <br>
        Contador de visitas: <%= this.contadorVisitas++ %>
    </body>
</html>
