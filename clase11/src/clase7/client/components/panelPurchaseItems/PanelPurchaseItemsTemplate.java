/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelPurchaseItems;

import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Emmanuel
 */
public class PanelPurchaseItemsTemplate extends JPanel{
    
    private PanelPurchaseItemsComponent panelPurchaseItemsComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    public PanelPurchaseItemsTemplate(PanelPurchaseItemsComponent panelPurchaseItemsComponent){
        this.panelPurchaseItemsComponent = panelPurchaseItemsComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.setSize(1030,570);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
