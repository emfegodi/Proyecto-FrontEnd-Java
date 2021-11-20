/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelUsers;

import clase7.client.components.panelExpenses.*;
import clase7.client.components.panelSaleBooks.*;

/**
 *
 * @author Emmanuel
 */
public class PanelUsersComponent {
    
    private PanelUsersTemplate panelUsersTemplate;
    
    public PanelUsersComponent(){
        panelUsersTemplate = new PanelUsersTemplate(this);
    }

    public PanelUsersTemplate getPanelUsersTemplate() {
        return panelUsersTemplate;
    }
    
    
}
