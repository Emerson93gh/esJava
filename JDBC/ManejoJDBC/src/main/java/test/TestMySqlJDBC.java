package test;

import java.sql.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        //cadena de conexion (en versiones mas recientes necesita mas parametros por seguridad despues de ?
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone="
                + "true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //ya no es requerido actualmente en conexiones locales, pero si en aplicacion web
            //Class.forName("com.mysql.cm.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "fbw10tw");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
//        } catch (ClassNotFoundException ex) { //deberia ir con el Class.forName...
//            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
