/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelExpenses;

import clase7.client.components.panelSaleBooks.*;

/**
 *
 * @author Emmanuel
 */
public class PanelExpensesComponent {
    
    private PanelExpensesTemplate panelExpensesTemplate;
    
    public PanelExpensesComponent(){
        panelExpensesTemplate = new PanelExpensesTemplate(this);
    }

    public PanelExpensesTemplate getPanelExpensesTemplate() {
        return panelExpensesTemplate;
    }
    
    
}
