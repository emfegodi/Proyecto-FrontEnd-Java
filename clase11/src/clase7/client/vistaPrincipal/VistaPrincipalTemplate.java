/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.vistaPrincipal;

import clase7.client.vistaPrincipal.VistaPrincipalComponent;
import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author emfeg
 */
public class VistaPrincipalTemplate extends JFrame {
    
    private VistaPrincipalComponent vistaPrincipalComponent;
    private JPanel pNavegacion, pBarra,pInformacion, pPrincipal;
     //Declaracion servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent){
        this.setTitle("Vista principal");
        
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos= RecursosService.getService();
        
        this.crearJPanels();
        
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public void crearJPanels(){
        //PANEL Navegacion
        pNavegacion = sObjGraficos.construirJPanel(
                0, 0,250,720, sRecursos.getColorAzul(),null );
        this.add(pNavegacion);
        
        pBarra = sObjGraficos.construirJPanel(
                250,0,1030,50, Color.WHITE,null );
        this.add(pBarra);
        
        pInformacion = sObjGraficos.construirJPanel(
                250,50,1030,100, sRecursos.getColorAzul(),null );
        this.add(pInformacion);
        
        pPrincipal = sObjGraficos.construirJPanel(
                250,150,1030,570, Color.WHITE,null );
        this.add(pPrincipal);
       
    }

    public JPanel getpNavegacion() {
        return pNavegacion;
    }

    public JPanel getpBarra() {
        return pBarra;
    }

    public JPanel getpInformacion() {
        return pInformacion;
    }

    public JPanel getpPrincipal() {
        return pPrincipal;
    }
    
    
}
