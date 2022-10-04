package test;

import datos.*;
import domain.Persona;
import java.sql.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);//normal es true, pero aca se hara manualmente.
            }
            PersonaDAO personaDAO = new PersonaDAO(conexion);//agregamos la conexion, para concepto transaccional.
            
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karla Ivonne");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kigomez@mail.com");
            cambioPersona.setTelefono("12345678");
            personaDAO.actualizar(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            //nuevaPersona.setApellido("Ramirez111111111111111111111111111111111111111111111");//error provocado
            nuevaPersona.setApellido("Ramirez");
            personaDAO.insertar(nuevaPersona);
            
            conexion.commit();//hasta este momento se guardaran los cambios.
            System.out.println("Se ha hecho commit de la transaccion!");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback!");//tras un error, no se hace ningun cambio en la BD.
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
        
    }
}
