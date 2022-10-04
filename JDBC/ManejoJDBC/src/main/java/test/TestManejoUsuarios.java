package test;

import datos.*;
import domain.Usuario;
import java.util.*;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        var usuarioDAO = new UsuarioDAO();
        
        //Ejecutar lista de usuarios
        List<Usuario> usuarios = usuarioDAO.seleccionar();
        for(Usuario usuario: usuarios){
        System.out.println("usuario = " + usuario);
        }
        
        //Insertar nuevo usuario
//        Usuario usuario = new Usuario("juan.carlos", "456");
//        usuarioDAO.insertar(usuario);

        //Modificar usuario existente
//        Usuario usuario = new Usuario(3, "juan.carlos", "789");
//        usuarioDAO.actualizar(usuario);
        
        //Eliminar usuario existente
        usuarioDAO.eliminar(new Usuario(3));
    }
}
