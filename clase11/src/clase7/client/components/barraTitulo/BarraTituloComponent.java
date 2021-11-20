/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.barraTitulo;

import clase7.client.login.LoginComponent;
import clase7.client.vistaPrincipal.VistaPrincipalComponent;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Emmanuel
 */
public class BarraTituloComponent implements ActionListener, MouseMotionListener, MouseListener {

    private BarraTituloTemplate barraTituloTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private LoginComponent loginComponent;
    private int pInicialX, pInicialY;
    private ImageIcon iDimAux;

    public BarraTituloComponent(VistaPrincipalComponent vistaPrincipalComponent,LoginComponent loginComponent) {
        this.loginComponent = loginComponent;
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        barraTituloTemplate = new BarraTituloTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == barraTituloTemplate.getbCerrar()) {
            loginComponent.restaurarValores();
            loginComponent.getLoginTemplate().setVisible(true);
            vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(false);
        }
    }

    public BarraTituloTemplate getBarraTituloTemplate() {
        return barraTituloTemplate;
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        vistaPrincipalComponent.moverVentana(me.getXOnScreen() - pInicialX, me.getYOnScreen() - pInicialY);
    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        pInicialX = me.getX() + 250;
        pInicialY = me.getY();
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == barraTituloTemplate.getbCerrar()) {
            JButton button = (JButton) me.getSource();
            iDimAux = new ImageIcon(RecursosService.getService().getiCerrar2().getImage().getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource() == barraTituloTemplate.getbCerrar()) {
            JButton button = (JButton) me.getSource();
            iDimAux = new ImageIcon(RecursosService.getService().getiCerrar().getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
    }
}
