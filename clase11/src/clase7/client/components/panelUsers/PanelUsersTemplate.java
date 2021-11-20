/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelUsers;

import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Emmanuel
 */
public class PanelUsersTemplate extends JPanel{
    
    private PanelUsersComponent panelUsersComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    public PanelUsersTemplate(PanelUsersComponent panelUsersComponent){
        this.panelUsersComponent = panelUsersComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.setSize(1030,570);
        this.setBackground(Color.MAGENTA);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
