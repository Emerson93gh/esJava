package test;

import datos.*;
import domain.Usuario;
import java.sql.*;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection(); //OJO aqui tuve error.
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexion);
            
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsuario(1);
            cambioUsuario.setUsername("juanito.perez");
            cambioUsuario.setPassword("7474");
            usuarioDAO.actualizar(cambioUsuario);
            
            Usuario nuevoUsuario = new Usuario();
            //nuevoUsuario.setUsername("Alexander.Solano111111111111111111111111111111111");//provocamos error
            nuevoUsuario.setUsername("alexander.solano");
            nuevoUsuario.setPassword("2626");
            usuarioDAO.insertar(nuevoUsuario);
            
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
//        for(Usuario usuario: usuarios){
//        System.out.println("usuario = " + usuario);
//        }
//        
//        //Insertar nuevo usuario
////        Usuario usuario = new Usuario("juan.carlos", "456");
////        usuarioDAO.insertar(usuario);
//
//        //Modificar usuario existente
////        Usuario usuario = new Usuario(3, "juan.carlos", "789");
////        usuarioDAO.actualizar(usuario);
//        
//        //Eliminar usuario existente
//        usuarioDAO.eliminar(new Usuario(3));
