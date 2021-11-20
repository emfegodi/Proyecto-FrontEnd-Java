/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.services.ServicesGraphics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author emfeg
 */
public class ObjGraficosService {

    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JComboBox comboBox;
    private JButton button;
    private JCheckBox checkBox;
    private ButtonGroup grupo;
    private JScrollPane panelScroll;

    static private ObjGraficosService servicio;

    private ObjGraficosService() {
    }

    //PANEL---------------------------------------------------------------------
    public JPanel construirJPanel(
            int x, int y, int ancho, int alto, Color colorPanel, Border border
    ) {
        panel = new JPanel();
        panel.setLocation(x, y);
        panel.setSize(ancho, alto);
        panel.setBackground(colorPanel);
        panel.setLayout(null);
        panel.setBorder(border);
        return panel;
    }

    //LABEL---------------------------------------------------------------------
    public JLabel construirJLabel(
            String texto, int x, int y, int ancho, int alto, Color colorTexto,
            Color colorFondo, Font fuente, ImageIcon img, String direccion
    ) {
        label = new JLabel(texto);
        label.setBounds(x, y, ancho, alto);
        label.setOpaque(true);
        label.setForeground(colorTexto);
        label.setBackground(colorFondo);
        label.setFont(fuente);
        label.setIcon(img);

        switch (direccion) {
            case "c":
                label.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                label.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "l":
                label.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            default:
                break;
        }
        return label;
    }

    public JTextField construirJTextField(
            String texto, int x, int y, int ancho, int alto, Color colorTexto,
            Color colorFondo, Font fuente, Border border, String direccion
    ) {
        textField = new JTextField(texto);
        textField.setSize(ancho, alto);
        textField.setLocation(x, y);
        textField.setForeground(colorTexto);
        textField.setBackground(colorFondo);
        textField.setBorder(border);
        switch (direccion) {
            case "c":
                textField.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                textField.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "l":
                textField.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            default:
                break;
        }
        return textField;
    }

    public JPasswordField construirJPasswordField(
            String texto, int x, int y, int ancho, int alto, Color colorTexto,
            Color colorFondo, Border border, String direccion
    ) {
        passwordField = new JPasswordField();
        passwordField.setText(texto);
        passwordField.setSize(ancho, alto);
        passwordField.setLocation(x, y);
        passwordField.setForeground(colorTexto);
        passwordField.setBackground(colorFondo);
        passwordField.setBorder(border);
        switch (direccion) {
            case "c":
                passwordField.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                passwordField.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "l":
                passwordField.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            default:
                break;
        }
        return passwordField;
    }

    public JComboBox construirJComboBox(String cadena, int x, int y, int ancho,
            int alto, Color colorTexto, Color colorFondo, String direccion) {
        comboBox = new JComboBox();

        comboBox.setBackground(colorFondo);
        comboBox.setForeground(colorTexto);
        comboBox.setSize(ancho, alto);
        comboBox.setLocation(x, y);
        String[] arregloCadena = cadena.split("_");
        for (int i = 0; i < arregloCadena.length; i++) {
            comboBox.addItem(arregloCadena[i]);
        }
        switch (direccion) {
            case "c":
                ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "l":
                ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.LEFT);
                break;
            default:
                break;
        }

        return comboBox;
    }

    public JCheckBox construirJCheckBox(
            String texto, int x, int y, int ancho, int alto, Color colorFondo,
            boolean focusable) {

        checkBox = new JCheckBox(texto);
        checkBox.setSize(ancho, alto);
        checkBox.setLocation(x, y);
        checkBox.setBackground(colorFondo);
        checkBox.setFocusable(focusable);
        return checkBox;
    }

    //BUTTON---------------------------------------------------------------------
    public JButton construirJButton(
            String texto, int x, int y, int ancho, int alto, Color colorFondo,
            Color colorTexto, boolean focusable, boolean relleno, Border border,
            ImageIcon img, String direccion
    ) {
        button = new JButton(texto);
        button.setSize(ancho, alto);
        button.setLocation(x, y);
        button.setBackground(colorFondo);
        button.setForeground(colorTexto);
        button.setFocusable(focusable);
        button.setBorder(border);
        button.setIcon(img);
        button.setContentAreaFilled(relleno);
        switch (direccion) {
            case "c":
                button.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                button.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "l":
                button.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            default:
                break;
        }

        return button;
    }

    public static ObjGraficosService getService() {
        if (servicio == null) {
            servicio = new ObjGraficosService();
        }
        return servicio;
    }

    public JScrollPane construirPanelBarra(
            Component componente, int x, int y, int ancho, int alto, Color color, Border borde
    ) {
        panelScroll = new JScrollPane(componente);
        panelScroll.setSize(ancho, alto);
        panelScroll.setLocation(x, y);
        panelScroll.getViewport().setBackground(color);
        panelScroll.setBorder(borde);
        return panelScroll;
    }
}
