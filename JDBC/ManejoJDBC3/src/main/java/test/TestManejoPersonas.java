package test;

import datos.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);//normal es true, pero aca se hara manualmente.
            }
            PersonaDAO personaDao = new PersonaDaoJDBC(conexion);//agregamos la conexion, para concepto transaccional.
            
            List<PersonaDTO> personas = personaDao.seleccionar();
            for(PersonaDTO persona: personas){
                System.out.println("Persona DTO: " + persona);
            }
            
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
