/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelSaleBooks;

import clase7.services.ServicesGraphics.RecursosService;
import clase7.services.ServicesLogic.LibroService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import models.Libro;

/**
 *
 * @author Emmanuel
 */
public class PanelSaleBooksComponent implements ActionListener, MouseListener, FocusListener {

    private PanelSaleBooksTemplate panelSaleBooksTemplate;
    private LibroService sLibros;
    private Libro libro;
    private String[] placeholdes = {"Nombre", "Autor", "Año", "Costo", "Descripcion"};

    public PanelSaleBooksComponent() {
        sLibros = LibroService.getServicio();
        panelSaleBooksTemplate = new PanelSaleBooksTemplate(this);
    }

    public PanelSaleBooksTemplate getPanelSaleBooksTemplate() {
        return panelSaleBooksTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == panelSaleBooksTemplate.getbMostrar()) {
            mostrarRegistrosTabla();
        }
    }
    public void mostrarRegistrosTabla() {
        System.out.print(sLibros.devolverCantLibros());
        for (int i = 0; i < sLibros.devolverCantLibros(); i++) {
            libro = sLibros.devolverLibro(i);
            this.agregarRegistro(libro);
        }
        panelSaleBooksTemplate.getlIdValor().setText(sLibros.devolverCantLibros() + "");
        panelSaleBooksTemplate.getbMostrar().setEnabled(false);
    }

    public void agregarRegistro(Libro libro) {
        panelSaleBooksTemplate.getModelo().addRow(
                new Object[]{libro.getId(), libro.getNombre(), libro.getAutor(), libro.getCosto()}
        );
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void focusGained(FocusEvent fe) {
        JTextField textField = ((JTextField) fe.getSource());
        textField.setBorder(RecursosService.getService().getBorderAzul());
        if(
            textField.getText().equals(placeholdes[0]) || textField.getText().equals(placeholdes[1]) ||
            textField.getText().equals(placeholdes[2]) || textField.getText().equals(placeholdes[3]) ||
            textField.getText().equals(placeholdes[4])
        )
            textField.setText("");

    }

    @Override
    public void focusLost(FocusEvent fe) {
        JTextField textField = ((JTextField) fe.getSource());
        textField.setBorder(RecursosService.getService().getBorder());

    }

}
