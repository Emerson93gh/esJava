package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // declaramos variable contador
        int contador = 0;

        // revisar si existe variable contadorVisitas
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if(c.getName().equals("contadorVisitas")) {
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        // incrementamos el contador en 1
        contador++;
        // agremamos la cookie a la respuesta del navegador
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        // la cookie se almacenara en el cliente por una hora, en segundos 3600
        c.setMaxAge(3600);
        response.addCookie(c);
        
        // mandamos mensaje al navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
    }
}
