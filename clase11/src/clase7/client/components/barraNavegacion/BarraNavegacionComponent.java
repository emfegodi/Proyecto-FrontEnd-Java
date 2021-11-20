/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.barraNavegacion;

import clase7.client.vistaPrincipal.VistaPrincipalComponent;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Emmanuel
 */
public class BarraNavegacionComponent implements ActionListener, MouseListener {

    private BarraNavegacionTemplate barraNavegacionTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private ImageIcon iDimAux;

    public BarraNavegacionComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.barraNavegacionTemplate = new BarraNavegacionTemplate(this);
        this.vistaPrincipalComponent = vistaPrincipalComponent;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == barraNavegacionTemplate.getbHome()) {
            vistaPrincipalComponent.mostrarComponent(ae.getActionCommand().trim());
        }
        if (ae.getSource() == barraNavegacionTemplate.getbSale()) {
            vistaPrincipalComponent.mostrarComponent(ae.getActionCommand().trim());
        }
        if (ae.getSource() == barraNavegacionTemplate.getbPurchase()) {
            vistaPrincipalComponent.mostrarComponent(ae.getActionCommand().trim());
        }
        if (ae.getSource() == barraNavegacionTemplate.getbExpenses()) {
            vistaPrincipalComponent.mostrarComponent(ae.getActionCommand().trim());
        }
        if (ae.getSource() == barraNavegacionTemplate.getbUsers()) {
            vistaPrincipalComponent.mostrarComponent(ae.getActionCommand().trim());
        }
        if (ae.getSource() == barraNavegacionTemplate.getbView()) {
            vistaPrincipalComponent.mostrarComponent(ae.getActionCommand().trim());
        }
        if (ae.getSource() == barraNavegacionTemplate.getbSettings()) {
            vistaPrincipalComponent.mostrarComponent(ae.getActionCommand().trim());
        }
        if (ae.getSource() == barraNavegacionTemplate.getbMenu()) {
            vistaPrincipalComponent.minimizarVentna();
        }

    }

    public BarraNavegacionTemplate getBarraNavegacionTemplate() {
        return barraNavegacionTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JButton button = (JButton) me.getSource();
        if(me.getSource()!= barraNavegacionTemplate.getbMenu())
            barraNavegacionTemplate.getlActivado().setLocation(3, button.getLocation().y);
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        JButton button = (JButton) me.getSource();
        button.setContentAreaFilled(true);
        button.setBackground(RecursosService.getService().getColorAzulOscuro());

        if (me.getSource() == barraNavegacionTemplate.getbHome()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiHome().getImage().getScaledInstance(45, 35, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbSale()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiSale().getImage().getScaledInstance(45, 35, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbPurchase()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiPurchase().getImage().getScaledInstance(45, 35, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbExpenses()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiExpenses().getImage().getScaledInstance(45, 35, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbUsers()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiUsers().getImage().getScaledInstance(45, 35, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbView()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiView().getImage().getScaledInstance(45, 35, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbSettings()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiSettings().getImage().getScaledInstance(45, 35, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        JButton button = (JButton) me.getSource();
        button.setContentAreaFilled(false);

        if (me.getSource() == barraNavegacionTemplate.getbHome()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiHome().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbSale()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiSale().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbPurchase()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiPurchase().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbExpenses()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiExpenses().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbUsers()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiUsers().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbView()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiView().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
        if (me.getSource() == barraNavegacionTemplate.getbSettings()) {
            iDimAux = new ImageIcon(RecursosService.getService().getiSettings().getImage().getScaledInstance(40, 30, Image.SCALE_AREA_AVERAGING));
            button.setIcon(iDimAux);
        }
    }

}
