package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        //aquí ya se podría escribir todo un codigo html, pero para eso mejor los JSP
        out.println("Hola mundo desde servlets!");
        //No se recomienda escribir codigo HTML aqui, seria demasiado complejo.
    }
}
