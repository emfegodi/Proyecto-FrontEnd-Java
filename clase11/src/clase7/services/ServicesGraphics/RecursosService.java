/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.services.ServicesGraphics;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author emfeg
 */
public class RecursosService {
    //Declaración de objetos decoradores

    private Color colorAzul, colorGris, colorRojo, colorVerde, colorAzulClaro, colorMorado,colorAzulOscuro;
    private Border border,borderAzul;
    private ImageIcon iRefrescar, iMenu,iCerrar,iCerrar2, iUsuario, iContraseña, iEslogan, 
            iGrafica, iRecivedPaid, iHome, iSale, iPurchase, iExpenses,
            iUsers, iView, iSettings, iDimAux, iSold, iPurchased, iCustomers;
    private Font fontTitulo, fontSubtitulo,fontBarraTitulo,fontBarraTituloGrande;
    
    private static RecursosService servicio;

    private RecursosService() {
        colorAzul = new Color(0, 70, 167);
        colorGris = new Color(227, 227, 227);
        colorRojo = new Color(238, 42, 61);
        colorVerde = new Color(39, 126, 87); 
        colorAzulClaro = new Color(61, 108, 233); 
        colorMorado = new Color(159, 28, 223);
        colorAzulOscuro = new Color(39, 60, 117);
        
        border = BorderFactory.createMatteBorder(0, 0, 2, 0, colorGris);
        borderAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorAzulClaro);
        fontTitulo = new Font("Gill Sans Ultra Bold", Font.PLAIN, 20);
        fontSubtitulo = new Font("Avenir Next LT Pro",Font.BOLD,14);
        fontBarraTitulo = new Font("Century Gothic", Font.BOLD,13);
        fontBarraTituloGrande = new Font("Century Gothic", Font.BOLD,18);
        //Imagenes
        iRefrescar = new ImageIcon("src/Resources/refrescar.png");
        iMenu = new ImageIcon("src/Resources/menu.png");
        iCerrar = new ImageIcon("src/Resources/xb.png");
        iCerrar2 = new ImageIcon("src/Resources/xb2.png");
        iEslogan = new ImageIcon("src/Resources/pinguino.png");
        iUsuario = new ImageIcon("src/Resources/usuario.png");
        iContraseña = new ImageIcon("src/Resources/contraseña.png");
        iHome = new ImageIcon("src/Resources/home.png");
        iSale = new ImageIcon("src/Resources/sale.png");
        iPurchase = new ImageIcon("src/Resources/purchase.png");  
        iExpenses = new ImageIcon("src/Resources/expenses.png");
        iUsers = new ImageIcon("src/Resources/users.png"); 
        iView = new ImageIcon("src/Resources/view.png"); 
        iSettings = new ImageIcon("src/Resources/settings.png");
        iGrafica = new ImageIcon("src/Resources/grafica.png");
        iRecivedPaid = new ImageIcon("src/Resources/RecivedPaid.png");
    }

    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;
    }

    public ImageIcon getiCerrar2() {
        return iCerrar2;
    }

    public Border getBorderAzul() {
        return borderAzul;
    }

    public Color getColorAzulOscuro() {
        return colorAzulOscuro;
    }
    
    public Color getColorAzul(){
        return colorAzul;
    }

    public Color getColorGris() {
        return colorGris;
    }

    public Color getColorRojo() {
        return colorRojo;
    }

    public Color getColorVerde() {
        return colorVerde;
    }

    public Color getColorAzulClaro() {
        return colorAzulClaro;
    }

    public Color getColorMorado() {
        return colorMorado;
    }

    
    public Border getBorder() {
        return border;
    }

    public ImageIcon getiSold() {
        return iSold;
    }

   
    public ImageIcon getiPurchased() {
        return iPurchased;
    }

    public ImageIcon getiCustomers() {
        return iCustomers;
    }

  
    
    public ImageIcon getiMenu() {
        return iMenu;
    }

    public ImageIcon getiRefrescar() {
        return iRefrescar;
    }

    public ImageIcon getiCerrar() {
        return iCerrar;
    }

    public ImageIcon getiUsuario() {
        return iUsuario;
    }

    public ImageIcon getiEslogan() {
        return iEslogan;
    }

    public ImageIcon getiHome() {
        return iHome;
    }


    public ImageIcon getiSale() {
        return iSale;
    }

    public ImageIcon getiPurchase() {
        return iPurchase;
    }

    public ImageIcon getiExpenses() {
        return iExpenses;
    }

    public ImageIcon getiUsers() {
        return iUsers;
    }

    public ImageIcon getiView() {
        return iView;
    }

    public ImageIcon getiSettings() {
        return iSettings;
    }

    public ImageIcon getiGrafica() {
        return iGrafica;
    }

    public ImageIcon getiRecivedPaid() {
        return iRecivedPaid;
    }

    public ImageIcon getiDimAux() {
        return iDimAux;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public Font getFontSubtitulo() {
        return fontSubtitulo;
    }

    public Font getFontBarraTitulo() {
        return fontBarraTitulo;
    }

    public ImageIcon getiContraseña() {
        return iContraseña;
    }

    public Font getFontBarraTituloGrande() {
        return fontBarraTituloGrande;
    }

    
}
