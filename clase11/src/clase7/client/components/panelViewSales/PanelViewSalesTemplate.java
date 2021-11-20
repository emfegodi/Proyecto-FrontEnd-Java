/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelViewSales;

import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Emmanuel
 */
public class PanelViewSalesTemplate extends JPanel{
    
    private PanelViewSalesComponent panelViewSalesComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    public PanelViewSalesTemplate(PanelViewSalesComponent panelViewSalesComponent){
        this.panelViewSalesComponent = panelViewSalesComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.setSize(1030,570);
        this.setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
