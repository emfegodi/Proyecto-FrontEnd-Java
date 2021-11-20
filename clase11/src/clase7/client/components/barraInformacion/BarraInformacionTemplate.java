/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.barraInformacion;

import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Emmanuel
 */
public class BarraInformacionTemplate extends JPanel{
    
    private BarraInformacionComponent barraInformacionComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JLabel lUsuario, lRole, lHora;
    
    public BarraInformacionTemplate(BarraInformacionComponent barraInformacionComponent){
        this.barraInformacionComponent = barraInformacionComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        crearJLabel();
        
        this.setSize(1030,100);
        this.setBackground(sRecursos.getColorAzul());
        this.setLayout(null);
        this.setVisible(true);
    }
    
     public void crearJLabel(){
       
        lUsuario = sObjGraficos.construirJLabel(
                "Welcome: "+barraInformacionComponent.getUsuarioLogeado().getNombreUsuario(),
                70,20, 250, 30, 
                Color.WHITE,null, sRecursos.getFontBarraTitulo(),null, "l");
        this.add(lUsuario); 
        
        lRole = sObjGraficos.construirJLabel(
                "Role: "+barraInformacionComponent.getUsuarioLogeado().getTipoUsuario(),
                102,55, 250, 30, 
                Color.WHITE,null, sRecursos.getFontBarraTitulo(),null, "l");
        this.add(lRole); 
        
        lHora = sObjGraficos.construirJLabel(
                "12:07:18",920,35, 250, 30, 
                Color.WHITE,null, sRecursos.getFontBarraTitulo(),null, "l");
        this.add(lHora); 
     }  
}