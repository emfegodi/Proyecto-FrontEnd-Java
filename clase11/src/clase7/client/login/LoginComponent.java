/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.login;

import clase7.client.vistaPrincipal.VistaPrincipalComponent;
import clase7.services.ServicesGraphics.RecursosService;
import clase7.services.ServicesLogic.UsuarioService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author emfeg
 */
public class LoginComponent implements ActionListener, MouseListener{

    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private UsuarioService sUsuario;

    public LoginComponent(){
        sUsuario = UsuarioService.getServicio();
        this.loginTemplate = new LoginTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== loginTemplate.getbEntrar()){
            this.enviarDatosUsuario();
        }
        if(e.getSource()== loginTemplate.getbCerrar()){
            System.exit(0);
        }
        if(e.getSource()== loginTemplate.getbCerrar()){
            System.exit(0);
        }
    }

    public void enviarDatosUsuario(){
        String nombreUsuario = loginTemplate.gettNombreUsuario().getText();
        String claveUsuario = new String(loginTemplate.gettClaveUsuario().getPassword());
        String tipoUsuario = ((String) loginTemplate.getCbTipoUsuario().getSelectedItem()); 
        
        if(sUsuario.verificarUsuario(nombreUsuario, claveUsuario, tipoUsuario)){
             JOptionPane.showMessageDialog(null, "Ingreso Exitoso", "Advertencia", 1); 
             entrar();
        }
        else JOptionPane.showMessageDialog(null, "Algo quedo mal", "Error", 2);    
        
        /*String check= "";
        if(loginTemplate.getCheckSi().isSelected())
            check="si";
        if(loginTemplate.getCheckNo().isSelected())
            check="no";*/
    }

    public void entrar(){
        if(this.vistaPrincipalComponent == null)
            this.vistaPrincipalComponent = new VistaPrincipalComponent(this);
        else{
            this.vistaPrincipalComponent.restaurarValores();
            this.vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(true);
        }
        
        loginTemplate.setVisible(false);
    }

    public void restaurarValores(){
        loginTemplate.gettNombreUsuario().setText("Nombre usuario");
        loginTemplate.gettNombreUsuario().setBorder(RecursosService.getService().getBorder());
        loginTemplate.gettClaveUsuario().setText("clave");
        loginTemplate.gettClaveUsuario().setBorder(RecursosService.getService().getBorder());
        loginTemplate.getCbTipoUsuario().setSelectedIndex(0);
        loginTemplate.getGrupo().clearSelection();
    }
    public LoginTemplate getLoginTemplate(){
        return this.loginTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource() instanceof JTextField){
            JTextField textField = (JTextField)me.getSource();
            if(textField.getText().equals("Nombre usuario"))
                textField.setText("");
            if(new String(loginTemplate.gettClaveUsuario().getPassword()).equals(""))
                loginTemplate.gettClaveUsuario().setBorder(RecursosService.getService().getBorder());
            textField.setBorder(RecursosService.getService().getBorderAzul());
        }
        if(me.getSource() instanceof JPasswordField){
            JPasswordField password = (JPasswordField)me.getSource();
            if(new String(password.getPassword()).equals("clave"))
                password.setText("");
            if(loginTemplate.gettNombreUsuario().getText().equals(""))
                loginTemplate.gettNombreUsuario().setBorder(RecursosService.getService().getBorder());
            password.setBorder(RecursosService.getService().getBorderAzul());
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource() instanceof JButton){
            JButton button = (JButton)me.getSource();
            button.setContentAreaFilled(true);
            button.setBackground(RecursosService.getService().getColorAzulOscuro());
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource() instanceof JButton){
            JButton button = (JButton)me.getSource();
            button.setBackground(RecursosService.getService().getColorAzul());
        }
    }

   
}