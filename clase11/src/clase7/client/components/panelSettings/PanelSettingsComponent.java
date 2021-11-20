/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelSettings;
/**
 *
 * @author Emmanuel
 */
public class PanelSettingsComponent {
    
    private PanelSettingsTemplate panelSettingsTemplate;
    
    public PanelSettingsComponent(){
        panelSettingsTemplate = new PanelSettingsTemplate(this);
    }

    public PanelSettingsTemplate getPanelSettingsTemplate() {
        return panelSettingsTemplate;
    }
    
    
}
