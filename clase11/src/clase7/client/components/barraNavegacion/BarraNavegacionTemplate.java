/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.barraNavegacion;

import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Emmanuel
 */
public class BarraNavegacionTemplate extends JPanel{
    
    private BarraNavegacionComponent barraNavegacionComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JLabel lTitulo, lEslogan, lActivado;
    private JButton bMenu, bHome, bSale, bPurchase, bExpenses, bUsers, bView, bSettings;
    private ImageIcon iDimAux;
    
    public BarraNavegacionTemplate(BarraNavegacionComponent barraNavegacionComponent){
        this.barraNavegacionComponent = barraNavegacionComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        crearJLabel();
        crearJButton();
        
        this.setSize(250,720);
        this.setBackground(sRecursos.getColorAzul());
        this.setLayout(null);
        this.setVisible(true);
    }
    
     public void crearJLabel(){
        lActivado =sObjGraficos.construirJLabel(
                null, 2,200,5,50,null,Color.WHITE, null,null, "c");
        this.add(lActivado);
        iDimAux = new ImageIcon(sRecursos.getiEslogan().getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        lEslogan =sObjGraficos.construirJLabel(
                null, 95,30,50,50,null,null, null,iDimAux, "c");
        this.add(lEslogan);
        
        lTitulo = sObjGraficos.construirJLabel(
                "<html><p align='center'>North Books Shop<br>Gilgit Pakistan<p></html>",0,80, 250, 60, 
                Color.WHITE,null, sRecursos.getFontBarraTitulo(),null, "c");
        this.add(lTitulo); 
     }
     
     public void crearJButton(){
        iDimAux = new ImageIcon(sRecursos.getiMenu().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        bMenu = sObjGraficos.construirJButton(
                "", 200, 10, 40, 30, 
                null, Color.WHITE, false, false, null,iDimAux,"l");
        bMenu.addActionListener(barraNavegacionComponent);
        bMenu.addMouseListener(barraNavegacionComponent);
        this.add(bMenu);
        
        iDimAux = new ImageIcon(sRecursos.getiHome().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        bHome = sObjGraficos.construirJButton(
                "     Home", 15, 200, 235, 50, 
                null, Color.WHITE, false, false, null,iDimAux,"l");
        /*String texto, int x, int y, int ancho,int alto,Color colorFondo,
            Color colorTexto, boolean focusable, boolean relleno,Border border, ImageIcon img*/
        bHome.addActionListener(barraNavegacionComponent);
        bHome.addMouseListener(barraNavegacionComponent);
        this.add(bHome);
        
        iDimAux = new ImageIcon(sRecursos.getiSale().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        bSale = sObjGraficos.construirJButton(
                "      Sale Books", 15, 250, 235, 50, 
                null, Color.WHITE, false, false, null,iDimAux,"l");
        bSale.addActionListener(barraNavegacionComponent);
        bSale.addMouseListener(barraNavegacionComponent);
        this.add(bSale);
       
        iDimAux = new ImageIcon(sRecursos.getiPurchase().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        bPurchase = sObjGraficos.construirJButton(
                "     Purchase Items", 15, 300, 235, 50, 
                null, Color.WHITE, false, false, null,iDimAux,"l");
        bPurchase.addActionListener(barraNavegacionComponent);
        bPurchase.addMouseListener(barraNavegacionComponent);
        this.add(bPurchase);
        
        iDimAux = new ImageIcon(sRecursos.getiExpenses().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        bExpenses = sObjGraficos.construirJButton(
                "     Expenses", 15, 350, 235, 50,  
                null, Color.WHITE, false, false, null,iDimAux,"l");
        bExpenses.addActionListener(barraNavegacionComponent);
        bExpenses.addMouseListener(barraNavegacionComponent);
        this.add(bExpenses);
        
        iDimAux = new ImageIcon(sRecursos.getiUsers().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        bUsers = sObjGraficos.construirJButton(
                "     Users", 15, 400, 235, 50, 
                null, Color.WHITE, false, false, null,iDimAux,"l");
        bUsers.addActionListener(barraNavegacionComponent);
        bUsers.addMouseListener(barraNavegacionComponent);
        this.add(bUsers);
        
        iDimAux = new ImageIcon(sRecursos.getiView().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        bView = sObjGraficos.construirJButton(
                "     View Sales", 15, 450, 235, 50, 
                null, Color.WHITE, false, false, null,iDimAux,"l");
        bView.addActionListener(barraNavegacionComponent);
        bView.addMouseListener(barraNavegacionComponent);
        this.add(bView);
        
        iDimAux = new ImageIcon(sRecursos.getiSettings().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
        bSettings = sObjGraficos.construirJButton(
                "     Settings", 15, 500, 235, 50, 
                null, Color.WHITE, false, false, null,iDimAux,"l");
        bSettings.addActionListener(barraNavegacionComponent);
        bSettings.addMouseListener(barraNavegacionComponent);
        this.add(bSettings);
        
     }

    public JButton getbMenu() {
        return bMenu;
    }

    public JButton getbHome() {
        return bHome;
    }

    public JLabel getlActivado() {
        return lActivado;
    }

    public JButton getbSale() {
        return bSale;
    }

    public JButton getbPurchase() {
        return bPurchase;
    }

    public JButton getbExpenses() {
        return bExpenses;
    }

    public JButton getbUsers() {
        return bUsers;
    }

    public JButton getbView() {
        return bView;
    }

    public JButton getbSettings() {
        return bSettings;
    }

    
    
}
