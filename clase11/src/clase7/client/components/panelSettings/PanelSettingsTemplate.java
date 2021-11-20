/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelSettings;

import java.awt.Color;
import javax.swing.JPanel;
import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;

/**
 *
 * @author Emmanuel
 */
public class PanelSettingsTemplate extends JPanel{
    
    private PanelSettingsComponent panelSettingsComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    public PanelSettingsTemplate(PanelSettingsComponent panelSettingsComponent){
        this.panelSettingsComponent = panelSettingsComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.setSize(1030,570);
        this.setBackground(Color.PINK);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
