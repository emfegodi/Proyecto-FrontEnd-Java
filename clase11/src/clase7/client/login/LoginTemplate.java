/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.login;

import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author emfeg
 */
public class LoginTemplate extends JFrame {
    
    //Declaracion servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    //Declaración objetos gráficos
    private JPanel pLogin, pFondo;
    private JLabel lTituloApp, lTituloLogin, lTipoUsuario, lRecordarContraseña,
            lCerrar, lUsuario, lContraseña, lEslogan;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox cbTipoUsuario;
    private JButton bEntrar, bCerrar, bOpcion;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    
    private ImageIcon iDimAux;
    
    private LoginComponent loginComponent;

    public LoginTemplate(LoginComponent loginComponent) {
        
        this.loginComponent= loginComponent;
        
        this.setSize(700, 500);
        sObjGraficos = ObjGraficosService.getService();
        sRecursos= RecursosService.getService();
        
        //creacion componentes
        this.crearJPanels();
        this.crearJLabel();
        this.crearJTextField();
        this.crearJPasswordField();
        this.crearJComboBox();
        this.crearJCheckBox();
        this.crearJButton();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setLayout(null);

    }
    
    public void crearJPanels(){
        //PANEL LOGIN
        pLogin = sObjGraficos.construirJPanel(
                (this.getWidth()/2)-175, 75, 350, 400, Color.WHITE,sRecursos.getBorder() );
        this.add(pLogin);
        //PANEL FONDO
        pFondo = sObjGraficos.construirJPanel(0, 0, 700, 500, sRecursos.getColorAzul(), null);
        this.add(pFondo);
    }
    
    public void crearJLabel(){
       
        lTituloApp = sObjGraficos.construirJLabel(
                "North Books Shop", (this.getWidth()/2)-125, 30, 250, 30, 
                Color.WHITE,null, sRecursos.getFontTitulo(),null, "c");
        pFondo.add(lTituloApp); 
        
        lTituloLogin = sObjGraficos.construirJLabel(
                "Login de usuario", (pLogin.getWidth()/2)-75, 15, 150, 30, 
                Color.DARK_GRAY,null, sRecursos.getFontSubtitulo(),null, "c");
        pLogin.add(lTituloLogin);
        
        iDimAux = new ImageIcon(
                sRecursos.getiUsuario().getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lUsuario = sObjGraficos.construirJLabel(
                null, 37,70,30,30, null,null, null, iDimAux, "c");
        pLogin.add(lUsuario);
        
        iDimAux = new ImageIcon(
                sRecursos.getiContraseña().getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lContraseña = sObjGraficos.construirJLabel(
                null, 37,110,30,30, null,null,null, iDimAux, "c");
        pLogin.add(lContraseña);
        
        lTipoUsuario = sObjGraficos.construirJLabel(
                "Tipo de Usuario", (pLogin.getWidth() - 200) / 2, 165, 200, 20, 
                Color.DARK_GRAY,null, sRecursos.getFontSubtitulo(),null, "c");
        pLogin.add(lTipoUsuario);
        
        lRecordarContraseña = sObjGraficos.construirJLabel(
                "Recordar contraseña", (pLogin.getWidth() - lTipoUsuario.getWidth()) / 2, 250, 200, 20, 
                Color.DARK_GRAY,null, sRecursos.getFontSubtitulo(),null, "c");
        pLogin.add(lRecordarContraseña);
        
        iDimAux = new ImageIcon(sRecursos.getiEslogan().getImage().getScaledInstance(80, 80, Image.SCALE_AREA_AVERAGING));
        lEslogan =sObjGraficos.construirJLabel(
                null, 47,(this.getHeight()/2)-40,80,80,null,null, null,iDimAux, "c");
        pFondo.add(lEslogan);
    }
    
    public void crearJTextField(){
        tNombreUsuario = sObjGraficos.construirJTextField(
                "Nombre usuario", (pLogin.getWidth() - 200) / 2, 75, 200, 20, 
                Color.DARK_GRAY, Color.WHITE, sRecursos.getFontSubtitulo(),sRecursos.getBorder(), "c");
        tNombreUsuario.addMouseListener(loginComponent);
        pLogin.add(tNombreUsuario);
    }
    
    public void crearJPasswordField(){
         tClaveUsuario = sObjGraficos.construirJPasswordField(
                "clave", (pLogin.getWidth() - 200) / 2, 115, 200, 20, 
                Color.DARK_GRAY, Color.WHITE,sRecursos.getBorder(), "c");
         tClaveUsuario.addMouseListener(loginComponent);
        pLogin.add(tClaveUsuario);
    }
    
    public void crearJComboBox(){
        cbTipoUsuario = sObjGraficos.construirJComboBox(
                "Cliente_Administrador", (pLogin.getWidth() - 200) / 2, 200, 
                200, 20,Color.DARK_GRAY, Color.white, "c");
        pLogin.add(cbTipoUsuario);
    }
    
    public void crearJCheckBox(){
        checkSi = sObjGraficos.construirJCheckBox(
                "si", (pLogin.getWidth() - 45) / 2 - 25, 285, 45, 20, Color.WHITE,false);
        pLogin.add(checkSi);

        checkNo = sObjGraficos.construirJCheckBox(
                "No", (pLogin.getWidth() - 45) / 2 + 25, 285, 45, 20, Color.WHITE,false);
        pLogin.add(checkNo);
        
        grupo = new ButtonGroup();
        grupo.add(checkSi);
        grupo.add(checkNo);
    }
    
    public void crearJButton(){
        
        bEntrar = sObjGraficos.construirJButton(
                "Entrar", (pLogin.getWidth() - 250) / 2, 335, 250, 35, 
                sRecursos.getColorAzul(), Color.white, false, true, null,null,"c");
        bEntrar.addActionListener(loginComponent);
        bEntrar.addMouseListener(loginComponent);
        pLogin.add(bEntrar);
        
        iDimAux = new ImageIcon(sRecursos.getiCerrar().getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        bCerrar = sObjGraficos.construirJButton(
                null, 630, 10, 50, 50, null, null, false, false, null, iDimAux,"c");
        bCerrar.addActionListener(loginComponent);
        pFondo.add(bCerrar);
        
        
    }

    public JButton getbEntrar() {
        return bEntrar;
    }

    public JButton getbCerrar() {
        return bCerrar;
    }

    public JButton getbOpcion() {
        return bOpcion;
    }

    public JTextField gettNombreUsuario() {
        return tNombreUsuario;
    }

    public JPasswordField gettClaveUsuario() {
        return tClaveUsuario;
    }

    public JComboBox getCbTipoUsuario() {
        return cbTipoUsuario;
    }

    public JCheckBox getCheckSi() {
        return checkSi;
    }

    public JCheckBox getCheckNo() {
        return checkNo;
    }

    public ButtonGroup getGrupo() {
        return grupo;
    }
    
    
}
