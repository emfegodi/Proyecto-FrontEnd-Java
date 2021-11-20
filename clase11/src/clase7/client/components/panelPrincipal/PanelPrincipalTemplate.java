/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelPrincipal;

import clase7.client.components.tarjeta.TarjetaComponent;
import clase7.client.components.tarjeta.TarjetaTemplate;
import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.Tarjeta;

/**
 *
 * @author Emmanuel
 */
public class PanelPrincipalTemplate extends JPanel {

    private PanelPrincipalComponent panelPrincipalComponent;
    
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lTitulo, lReport, lRecivedPaid,
            lAmount, lGraficaReporte, lGraficoRecibidos;
    private JButton bRefrescar;
    private ImageIcon iDimAux;
    private JPanel pVentasInfo;

    public PanelPrincipalTemplate(PanelPrincipalComponent panelPrincipalComponent) {
        this.panelPrincipalComponent = panelPrincipalComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        crearJPanel();
        crearContenidoPVentasInfo();
        crearJButton();
        crearJLabel();

        this.setSize(1030, 570);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearJPanel() {
        pVentasInfo = sObjGraficos.construirJPanel(150, 140, 690, 90, null, null);
        this.add(pVentasInfo);
    }

    public void crearContenidoPVentasInfo() {
        int numeroTarjeta = 0;
        Tarjeta tarjeta = panelPrincipalComponent.getTarjeta(numeroTarjeta);

        while (tarjeta != null) {
            
            TarjetaTemplate pTarjeta = new TarjetaComponent(numeroTarjeta*240, 0, 180, 90,
                    numeroTarjeta, tarjeta.getNombreTarjeta(),
                    tarjeta.getValor(), tarjeta.getImagenTarjeta()).getTarjetaTemplate();
            pVentasInfo.add(pTarjeta);

            numeroTarjeta++;
            tarjeta = panelPrincipalComponent.getTarjeta(numeroTarjeta);

        }
    }

    public void crearJLabel() {
        lReport = sObjGraficos.construirJLabel(
                "Yearly Report:", 150, 260, 200, 40,
                sRecursos.getColorAzul(), null, sRecursos.getFontBarraTitulo(), null, "l");
        this.add(lReport);

        lAmount = sObjGraficos.construirJLabel(
                "% Amount Recived and Paid", 620, 310, 200, 40,
                sRecursos.getColorAzul(), null, sRecursos.getFontBarraTitulo(), null, "l");
        this.add(lAmount);

        iDimAux = new ImageIcon(sRecursos.getiGrafica().getImage().getScaledInstance(370, 190, Image.SCALE_AREA_AVERAGING));
        lGraficaReporte = sObjGraficos.construirJLabel(
                "", 160, 310, 380, 200,
                sRecursos.getColorAzul(), null, sRecursos.getFontBarraTituloGrande(), iDimAux, "c");
        this.add(lGraficaReporte);

        iDimAux = new ImageIcon(sRecursos.getiRecivedPaid().getImage().getScaledInstance(260, 100, Image.SCALE_AREA_AVERAGING));
        lGraficoRecibidos = sObjGraficos.construirJLabel(
                "", 620, 370, 270, 110,
                sRecursos.getColorAzul(), null, sRecursos.getFontBarraTituloGrande(), iDimAux, "c");
        this.add(lGraficoRecibidos);

        lRecivedPaid = sObjGraficos.construirJLabel(
                "        Recived                             Paid", 620, 480, 270, 30,
                sRecursos.getColorAzul(), null, sRecursos.getFontBarraTitulo(), null, "l");
        this.add(lRecivedPaid);

        lTitulo = sObjGraficos.construirJLabel(
                "Sales and Purchase Overview", 0, 50, 1030, 60,
                sRecursos.getColorAzul(), null, sRecursos.getFontBarraTituloGrande(), null, "c");
        this.add(lTitulo);
    }

    public void crearJButton() {
        iDimAux = new ImageIcon(sRecursos.getiRefrescar().getImage().getScaledInstance(50, 40, Image.SCALE_AREA_AVERAGING));
        bRefrescar = sObjGraficos.construirJButton(
                "     Settings", 850, 57, 60, 50,
                null, Color.WHITE, false, false, null, iDimAux, "c");
        bRefrescar.addActionListener(panelPrincipalComponent);
        this.add(bRefrescar);

    }
}
