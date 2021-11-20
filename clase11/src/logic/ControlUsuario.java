/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import models.Usuario;

/**
 *
 * @author Emmanuel
 */
public class ControlUsuario {

    private ArrayList<Usuario> usuarios;

    public ControlUsuario() {
        usuarios = new ArrayList<Usuario>();
        cargarDatos();
    }

    public void cargarDatos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("src/archivos/usuarios.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] atributos = linea.split(",");
                Usuario usuario = new Usuario();
                usuario.setNombreUsuario(atributos[0]);
                usuario.setClaveUsuario(atributos[1]);
                usuario.setTipoUsuario(atributos[2]);
                usuarios.add(usuario);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean verificarUsuario(String usuario, String clave, String tipoU) {
        for(Usuario user : usuarios){
            if(user.getNombreUsuario().equals(usuario))
                if(user.getClaveUsuario().equals(clave))
                    if(user.getTipoUsuario().equals(tipoU))
                        return true;
        }
        return false;
    }
    
    public Usuario devolverUsuario(String nombreUsuario){
        for(Usuario user : usuarios){
            if(user.getNombreUsuario().equals(nombreUsuario))
                return user;
        }
        return null;
    }

}
