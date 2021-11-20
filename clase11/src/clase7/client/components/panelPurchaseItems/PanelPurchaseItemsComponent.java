/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelPurchaseItems;

import clase7.client.components.panelSaleBooks.PanelSaleBooksTemplate;

/**
 *
 * @author Emmanuel
 */
public class PanelPurchaseItemsComponent {
    
    private PanelPurchaseItemsTemplate panelPurchaseItemsTemplate;
    
    public PanelPurchaseItemsComponent(){
        panelPurchaseItemsTemplate = new PanelPurchaseItemsTemplate(this);
    }

    public PanelPurchaseItemsTemplate getPanelPurchaseItemsTemplate() {
        return panelPurchaseItemsTemplate;
    }
    
    
}
