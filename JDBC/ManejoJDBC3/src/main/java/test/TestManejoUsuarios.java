package test;

import datos.*;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            UsuarioDAO usuarioDao = new UsuarioDaoJDBC(conexion);//Interface - Tecnología (JDBC)
            
            List<UsuarioDTO> usuarios = usuarioDao.seleccionar();
            for(UsuarioDTO usuario: usuarios){
                System.out.println("Usuario DTO: " + usuario);
            }
            
            conexion.commit();
            System.out.println("Se ha hecho el commit de la transaccion!");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos en rollback!!!");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    }
}

////Ejecutar lista de usuarios
//        List<Usuario> usuarios = usuarioDAO.seleccionar();
//        for(UsuarioDTO usuario: usuarios){
//        System.out.println("usuario = " + usuario);
//        }
//        
//        //Insertar nuevo usuario
////        UsuarioDTO usuario = new UsuarioDTO("juan.carlos", "456");
////        usuarioDAO.insertar(usuario);
//
//        //Modificar usuario existente
////        UsuarioDTO usuario = new UsuarioDTO(3, "juan.carlos", "789");
////        usuarioDAO.actualizar(usuario);
//        
//        //Eliminar usuario existente
//        usuarioDAO.eliminar(new UsuarioDTO(3));
