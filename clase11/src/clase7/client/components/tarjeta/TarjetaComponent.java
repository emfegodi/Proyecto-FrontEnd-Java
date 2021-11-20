/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.tarjeta;

import javax.swing.ImageIcon;

/**
 *
 * @author Emmanuel
 */
public class TarjetaComponent {
    
    private TarjetaTemplate tarjetaTemplate;
    
    public TarjetaComponent(int x, int y, int ancho, int alto, int numColor, 
            String titulo, String valor,ImageIcon img){
        tarjetaTemplate = new TarjetaTemplate(this,x,y, ancho, alto, 
                numColor, titulo, valor, img);
    }

    public TarjetaTemplate getTarjetaTemplate() {
        return tarjetaTemplate;
    }
    
}
