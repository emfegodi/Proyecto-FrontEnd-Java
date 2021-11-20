/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.ImageIcon;

/**
 *
 * @author Emmanuel
 */
public class Tarjeta {
    private String nombreTarjeta;
    private String valor;
    private ImageIcon ImagenTarjeta;

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public String getValor() {
        return valor;
    }

    public ImageIcon getImagenTarjeta() {
        return ImagenTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setImagenTarjeta(ImageIcon ImagenTarjeta) {
        this.ImagenTarjeta = ImagenTarjeta;
    }
   
    
}
