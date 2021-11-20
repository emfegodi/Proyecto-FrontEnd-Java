/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.barraTitulo;

import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Emmanuel
 */
public class BarraTituloTemplate extends JPanel{
    
    private BarraTituloComponent barraTituloComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JLabel lTitulo;
    private JButton bCerrar;
    private ImageIcon iDimAux;
    
    public BarraTituloTemplate(BarraTituloComponent barraTituloComponent){
        this.barraTituloComponent = barraTituloComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        this.addMouseMotionListener(barraTituloComponent);
        this.addMouseListener(barraTituloComponent);
        
        crearJLabel();
        crearJButton();
        
        this.setSize(1030,50);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setVisible(true);
    }
    
     public void crearJLabel(){
       
        lTitulo = sObjGraficos.construirJLabel(
                "North Books Shop, NLI Market Gilgit",20,10, 250, 30, 
                sRecursos.getColorAzul(),null, sRecursos.getFontBarraTitulo(),null, "l");
        this.add(lTitulo); 
     }
     
     public void crearJButton(){
        iDimAux = new ImageIcon(sRecursos.getiCerrar().getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        bCerrar = sObjGraficos.construirJButton(
                "", 970, 0, 50, 50, 
                null, null, false, false, null,iDimAux,"c");
        bCerrar.addActionListener(barraTituloComponent);
        bCerrar.addMouseListener(barraTituloComponent);
        this.add(bCerrar);
     }

    public JButton getbCerrar() {
        return bCerrar;
    }

    public BarraTituloComponent getBarraTituloComponent() {
        return barraTituloComponent;
    }
     
     
}
