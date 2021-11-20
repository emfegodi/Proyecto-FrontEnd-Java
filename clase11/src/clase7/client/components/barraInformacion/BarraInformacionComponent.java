/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.barraInformacion;

import clase7.services.ServicesLogic.UsuarioService;
import models.Usuario;

/**
 *
 * @author Emmanuel
 */
public class BarraInformacionComponent {

    private BarraInformacionTemplate barraInformacionTemplate;
    private UsuarioService sUsuario;
    private Usuario usuarioLogeado;
    
    public BarraInformacionComponent(){
        sUsuario = UsuarioService.getServicio();
        usuarioLogeado = sUsuario.getUsuarioLogeado();
        barraInformacionTemplate = new BarraInformacionTemplate(this);
    }
    
    
    public BarraInformacionTemplate getBarraInformacionTemplate(){
        return barraInformacionTemplate;
    }

    public void actualizarValores(){
        usuarioLogeado = sUsuario.getUsuarioLogeado();
        barraInformacionTemplate.removeAll();
        barraInformacionTemplate.crearJLabel();
        
    }
    public Usuario getUsuarioLogeado() {
        return usuarioLogeado;
    }
    
    
}

