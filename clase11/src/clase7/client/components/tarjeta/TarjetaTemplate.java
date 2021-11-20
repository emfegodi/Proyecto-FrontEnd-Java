/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.tarjeta;

import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Emmanuel
 */
public class TarjetaTemplate extends JPanel {

    private TarjetaComponent tarjetaComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private ImageIcon iDimAux;
    private JLabel lTexto, lImagen;

    public TarjetaTemplate(TarjetaComponent tarjetaComponent,
            int x, int y, int ancho, int alto, int numColor, String titulo, String valor, ImageIcon img) {

        this.tarjetaComponent = tarjetaComponent;

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        /*
        if(numColor>2)
            numColor = numColor-((numColor/3)*3);
         */
        switch (numColor) {
            case 0:
                this.setBackground(sRecursos.getColorVerde());
                break;
            case 1:
                this.setBackground(sRecursos.getColorRojo());
                ancho += 40;
                break;
            case 2:
                this.setBackground(sRecursos.getColorAzulClaro());
                x += 40;
                break;
            default:
        }

        lTexto = sObjGraficos.construirJLabel(
                "<html> <p align='center'>" + titulo + "<br><br>" + valor + "</p></html>", 0, 0, ancho - 80, alto,
                Color.WHITE, null, sRecursos.getFontBarraTitulo(), null, "c");
        this.add(lTexto);

        iDimAux = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        lImagen = sObjGraficos.construirJLabel(
                "", ancho - 80, 0, 80, alto,
                null, null, sRecursos.getFontBarraTituloGrande(), iDimAux, "c");
        this.add(lImagen);

        this.setLocation(x, y);
        this.setSize(ancho, alto);
        this.setLayout(null);
        this.setBorder(null);

    }

}
