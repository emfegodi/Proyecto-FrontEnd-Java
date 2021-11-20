/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelPrincipal;

import clase7.services.ServicesLogic.TarjetaService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Tarjeta;

/**
 *
 * @author Emmanuel
 */
public class PanelPrincipalComponent implements ActionListener {

    private PanelPrincipalTemplate panelPrincipalTemplate;
    private TarjetaService sTarjeta;

    public PanelPrincipalComponent() {
        sTarjeta = TarjetaService.getService();
        this.panelPrincipalTemplate = new PanelPrincipalTemplate(this);
    }

    public Tarjeta getTarjeta(int posicion) {
        return sTarjeta.devolverTarjeta(posicion);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    public PanelPrincipalTemplate getPanelPrincipalTemplate() {
        return panelPrincipalTemplate;
    }

}
