/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.services.ServicesLogic;

import logic.ControlUsuario;
import models.Usuario;

/**
 *
 * @author Emmanuel
 */
public class UsuarioService {

    private static UsuarioService servicio;
    private ControlUsuario cUsuario;
    private String usuarioLogeado;

    public UsuarioService() {
        cUsuario = new ControlUsuario();
    }

    public boolean verificarUsuario(String usuario, String clave, String tipoU) {
        if (cUsuario.verificarUsuario(usuario, clave, tipoU)) {
            this.usuarioLogeado = usuario;
            return true;
        }
        return false;
    }
    
    public Usuario getUsuarioLogeado(){
        return cUsuario.devolverUsuario(this.usuarioLogeado);
    }

    public static UsuarioService getServicio() {
        if (servicio == null) {
            servicio = new UsuarioService();
        }
        return servicio;
    }

}
