package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset-UTF-8");
                    
        // creamos o recuperamos el objeto http session
        HttpSession sesion = request.getSession();
        
        // recuperamos la lista de articulos de la sesion
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        
        // verificamos si existe la lista de articulos
        if(articulos == null) {
            // inicializamos la lista
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        
        // procesamos un nuevo articulo
        String articuloNuevo = request.getParameter("articulo");
        
        // revisamos y agremamos un nuevo articulo
        if(articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }
        
        // imprimimos lista de articulos
        PrintWriter out = response.getWriter();
        out.print("<h1>Lista de articulos: </h1>");
        out.print("<br>");
        // iteramos cada uno de los articulos
        for(String articulo: articulos) {
            out.print("<li>" + articulo + "</li>");
        }
        out.print("<br>");
        // agregamos link para regresar al inicio
        out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
        out.close(); //tambiem se puede usar la opcion del IDE try-with-resources para omitir el close()
    }
}
