/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.vistaPrincipal;

import clase7.client.components.barraInformacion.BarraInformacionComponent;
import clase7.client.components.barraNavegacion.BarraNavegacionComponent;
import clase7.client.components.barraTitulo.BarraTituloComponent;
import clase7.client.components.panelExpenses.PanelExpensesComponent;
import clase7.client.components.panelPrincipal.PanelPrincipalComponent;
import clase7.client.components.panelPurchaseItems.PanelPurchaseItemsComponent;
import clase7.client.components.panelSaleBooks.PanelSaleBooksComponent;
import clase7.client.components.panelSettings.PanelSettingsComponent;
import clase7.client.components.panelUsers.PanelUsersComponent;
import clase7.client.components.panelViewSales.PanelViewSalesComponent;
import clase7.client.login.LoginComponent;
import java.awt.Frame;
/**
 *
 * @author emfeg
 */
public class VistaPrincipalComponent {
    
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    //Declaracion de componentes 
    private BarraTituloComponent barraTituloComponent;
    private BarraInformacionComponent barraInformacionComponent;
    private BarraNavegacionComponent barraNavegacionComponent;
    private LoginComponent loginComponent;
    private PanelSaleBooksComponent panelSaleBooksComponent;
    private PanelPrincipalComponent panelPrincipalComponent;
    private PanelPurchaseItemsComponent panelPurchaseItemsComponent;
    private PanelExpensesComponent panelExpensesComponent;
    private PanelUsersComponent panelUsersComponent;
    private PanelViewSalesComponent panelViewSalesComponent;
    private PanelSettingsComponent panelSettingsComponent;
    
    public VistaPrincipalComponent(LoginComponent loginComponent){
       
       this.loginComponent = loginComponent;
       vistaPrincipalTemplate= new VistaPrincipalTemplate(this);
       barraNavegacionComponent = new BarraNavegacionComponent(this);
       panelPrincipalComponent = new PanelPrincipalComponent();
       barraInformacionComponent = new BarraInformacionComponent();
       vistaPrincipalTemplate.getpPrincipal().add(panelPrincipalComponent.getPanelPrincipalTemplate());
       vistaPrincipalTemplate.getpBarra().add(new BarraTituloComponent(this,loginComponent).getBarraTituloTemplate());
       vistaPrincipalTemplate.getpInformacion().add(barraInformacionComponent.getBarraInformacionTemplate());
       vistaPrincipalTemplate.getpNavegacion().add(barraNavegacionComponent.getBarraNavegacionTemplate());
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate(){
        return this.vistaPrincipalTemplate;
    }
    
    public void mostrarComponent(String boton){
        
        vistaPrincipalTemplate.getpPrincipal().removeAll();
        switch(boton){
            case "Home":
                if(panelPrincipalComponent == null)
                    panelPrincipalComponent = new PanelPrincipalComponent();
                vistaPrincipalTemplate.getpPrincipal().add(panelPrincipalComponent.getPanelPrincipalTemplate());
                break;
            case "Sale Books":
                if(panelSaleBooksComponent == null)
                    panelSaleBooksComponent = new PanelSaleBooksComponent();
                vistaPrincipalTemplate.getpPrincipal().add(panelSaleBooksComponent.getPanelSaleBooksTemplate());
                break;
            case "Purchase Items":
                if(panelPurchaseItemsComponent == null)
                    panelPurchaseItemsComponent = new PanelPurchaseItemsComponent();
                vistaPrincipalTemplate.getpPrincipal().add(panelPurchaseItemsComponent.getPanelPurchaseItemsTemplate());
                break;
            case "Expenses":
                if(panelExpensesComponent == null)
                    panelExpensesComponent = new PanelExpensesComponent();
                vistaPrincipalTemplate.getpPrincipal().add(panelExpensesComponent.getPanelExpensesTemplate());
                break;
            case "Users":
                if(panelUsersComponent == null)
                    panelUsersComponent = new PanelUsersComponent();
                vistaPrincipalTemplate.getpPrincipal().add(panelUsersComponent.getPanelUsersTemplate());
                break;
            case "View Sales":
                if(panelViewSalesComponent == null)
                    panelViewSalesComponent = new PanelViewSalesComponent();
                vistaPrincipalTemplate.getpPrincipal().add(panelViewSalesComponent.getPanelViewSalesTemplate());
                break;
            case "Settings":
                if(panelSettingsComponent == null)
                    panelSettingsComponent = new PanelSettingsComponent();
                vistaPrincipalTemplate.getpPrincipal().add(panelSettingsComponent.getPanelSettingsTemplate());
                break;
            default:
                
        }   
        vistaPrincipalTemplate.repaint();
    }

    public LoginComponent getLoginComponent() {
        return loginComponent;
    }
    
    public void moverVentana(int x, int y){
        vistaPrincipalTemplate.setLocation(x, y);
    }
    
    public void minimizarVentna(){
        vistaPrincipalTemplate.setExtendedState(Frame.ICONIFIED);
    }
    
    public void restaurarValores(){
        vistaPrincipalTemplate.getpPrincipal().removeAll();
        barraNavegacionComponent.getBarraNavegacionTemplate().getlActivado().setLocation(2, 200);
        vistaPrincipalTemplate.getpPrincipal().add(panelPrincipalComponent.getPanelPrincipalTemplate());
        barraInformacionComponent.actualizarValores();
        vistaPrincipalTemplate.repaint();
    }
}
