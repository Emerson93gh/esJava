package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      response.setContentType("text/html;charset-UTF-8");
      
      HttpSession sesion = request.getSession();
      String titulo = null;
      
      // pedimos el atributo contadorVisitas a la sesion
      Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
      // si es nulo, es la primera vez que accedemos a la aplicacion
      if(contadorVisitas == null) {
          contadorVisitas = 1;
          titulo = "Bienvenido/a por primera vez";
      } else {
          contadorVisitas++;
          titulo = "Bienvenido/a nuevamente!";
      }
      
      // agregamos el nuevo valor a la sesion
      sesion.setAttribute("contadorVisitas", contadorVisitas);
      
      // mandamos la respuesta al cliente
      PrintWriter out = response.getWriter();
      out.print(titulo);
      out.print("<br>");
      out.print("No. de accesos al recurso: " + contadorVisitas);
      out.print("<br>");
      out.print("ID de la sesion: " + sesion.getId());
      out.close();
    }
}
