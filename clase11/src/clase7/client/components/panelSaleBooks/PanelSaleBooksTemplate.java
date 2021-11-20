/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.client.components.panelSaleBooks;

import clase7.services.ServicesGraphics.GraficosAvanzadosService;
import clase7.services.ServicesGraphics.ObjGraficosService;
import clase7.services.ServicesGraphics.RecursosService;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Emmanuel
 */
public class PanelSaleBooksTemplate extends JPanel{
    
    private PanelSaleBooksComponent panelSaleBooksComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private GraficosAvanzadosService sGraficosAvanzados;
    private JPanel pTabla,pDatos;
    
    private JButton bMostrar, bInsertar, bFiltrar, bModificar, bEliminar;
    private JTextField tConsulta;
    private JLabel lTitulo, lInstrucciones, lEslogan;
    private JLabel lId, lIdValor, lNombre, lEdad, lOficio, lTelefono, lEmail;
    private JTextField tNombre, tEdad, tOficio, tTelefono, tEmail;
    
     // Declaración objetos para JTable
    private JScrollPane jpTabla;
    private JPanel pCorner;
    private JTable tabla;
    private JTableHeader header;
    private DefaultTableModel modelo;
    private String [] cabecera={"id", "Nombre", "Autor", "Costo"};
    
    public PanelSaleBooksTemplate(PanelSaleBooksComponent panelSaleBooksComponent){
        this.panelSaleBooksComponent = panelSaleBooksComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        sGraficosAvanzados = GraficosAvanzadosService.getService();
        crearPanel();
        crearContenidoPTabla();
        crearContenidoPDatos();
        crearJTable();
        
        this.setSize(1030,570);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public void crearPanel(){
        pTabla = sObjGraficos.construirJPanel(10, 10, 1010, 340, Color.WHITE, null);
        this.add(pTabla);
        
        pDatos = sObjGraficos.construirJPanel(10, 360, 1010, 200, Color.WHITE, null);
        this.add(pDatos);
    }
    
    public void crearContenidoPTabla(){
        // LABEL TITULO--------------------------------------------------------------------
        /*String texto, int x, int y, int ancho, int alto, Color colorTexto,
            Color colorFondo,Font fuente, ImageIcon img, String direccion*/
        lTitulo = sObjGraficos.construirJLabel(
            "Edición de libros", 610, 10, 200, 30, null, null, 
             sRecursos.getFontBarraTitulo(),null, "l"
        );
        pTabla.add(lTitulo);

        // TEXTFIELD CONSULTA--------------------------------------------------------------------
        /* String texto, int x, int y, int ancho, int alto, Color colorTexto,
            Color colorFondo, Font fuente, Border border, String direccion*/
        tConsulta = sObjGraficos.construirJTextField(
            "Filtrar...", 610, 60, 380, 40, null , null, 
            null, sRecursos.getBorder(), "c"
        );
        tConsulta.addFocusListener(panelSaleBooksComponent);
        pTabla.add(tConsulta);

        // BOTÓN FILTRAR--------------------------------------------------------------------
        /*String texto, int x, int y, int ancho,int alto,Color colorFondo,
            Color colorTexto, boolean focusable, boolean relleno,Border border, 
            ImageIcon img, String direccion*/
        bFiltrar = sObjGraficos.construirJButton(
            "Filtrar", 610, 65, 120, 35, sRecursos.getColorAzul(), Color.WHITE, false, 
            true, null, null, "c"
        );
        bFiltrar.addMouseListener(panelSaleBooksComponent);
        bFiltrar.addActionListener(panelSaleBooksComponent);
        pTabla.add(bFiltrar);

        // BOTÓN MOSTRAR--------------------------------------------------------------------
        bMostrar = sObjGraficos.construirJButton(
            "Mostrar", 610, 145, 120, 35, sRecursos.getColorAzul(), Color.WHITE, false, 
            true, null, null, "c"
        );
        bMostrar.addMouseListener(panelSaleBooksComponent);
        bMostrar.addActionListener(panelSaleBooksComponent);
        pTabla.add(bMostrar);

        // BOTÓN INSERTAR--------------------------------------------------------------------
        bInsertar = sObjGraficos.construirJButton(
            "Insertar", 865, 145, 120, 35, sRecursos.getColorAzul(), Color.WHITE, false, 
            true, null, null, "c"
        );
        bInsertar.addMouseListener(panelSaleBooksComponent);
        bInsertar.addActionListener(panelSaleBooksComponent);
        pTabla.add(bInsertar);

        // BOTÓN MODIFICAR--------------------------------------------------------------------
        bModificar = sObjGraficos.construirJButton(
            "Modificar", 610, 225, 120, 35, sRecursos.getColorAzul(), Color.WHITE, false, 
            true, null, null, "c"
        );
        bModificar.addMouseListener(panelSaleBooksComponent);
        bModificar.addActionListener(panelSaleBooksComponent);
        pTabla.add(bModificar);

        // BOTÓN ELIMINAR--------------------------------------------------------------------
        bEliminar= sObjGraficos.construirJButton(
            "Eliminar", 865,  225, 120, 35, sRecursos.getColorAzul(), Color.WHITE, false, 
            true, null, null, "c"
        );
        bEliminar.addMouseListener(panelSaleBooksComponent);
        bEliminar.addActionListener(panelSaleBooksComponent);
        pTabla.add(bEliminar);
    }
    
    public void crearContenidoPDatos(){
        // LABEL INSTRUCCIONES ----------------------------------------------------------------
        /*String texto, int x, int y, int ancho, int alto, Color colorTexto,
            Color colorFondo,Font fuente, ImageIcon img, String direccion*/
        lInstrucciones = sObjGraficos.construirJLabel(
            "<html>Datos de los libros<html>", 20, 5, 200, 25, null, 
            null, sRecursos.getFontBarraTitulo(), null, "l"
        );
        pDatos.add(lInstrucciones);

        // LABEL ESLOGAN ----------------------------------------------------------------
        lEslogan = sObjGraficos.construirJLabel(
            "<html>A continuación puede ver y editar la información del libro<html>", 
            20, 30, 500, 25, null, 
            null, sRecursos.getFontBarraTitulo(), null, "l"
        );
        pDatos.add(lEslogan);

        // LABEL ID ----------------------------------------------------------------
        lId = sObjGraficos.construirJLabel(
            "Id Contacto:", 20, 60, 100, 30, null, 
            null, sRecursos.getFontBarraTitulo(), null, "l"
        );
        pDatos.add(lId);

        // LABEL ID CONTENIDO ----------------------------------------------------------
        lIdValor = sObjGraficos.construirJLabel(
            "0", 120, 60, 20, 30, null, 
            null, sRecursos.getFontBarraTitulo(), null, "l"
        );
        pDatos.add(lIdValor);

        
        // LABEL NOMBRE ----------------------------------------------------------------
        lNombre = sObjGraficos.construirJLabel(
            "Nombre Contacto:", 20, 100, 160, 30,null,null, sRecursos.getFontBarraTitulo(), null, "l"
        );
        pDatos.add(lNombre);

        // TEXTFIELD NOMBRE ----------------------------------------------------------------
        tNombre = sObjGraficos.construirJTextField(
            "Nombre", 30, 140, 180, 30, null , null, null, sRecursos.getBorder(), "c"
        );
        tNombre.addFocusListener(panelSaleBooksComponent);
        pDatos.add(tNombre);

        // LABEL EDAD ----------------------------------------------------------------
        lEdad = sObjGraficos.construirJLabel(
            "Autor:", 220, 100, 180, 30,null,null, sRecursos.getFontBarraTitulo(), null, "c"
        );
        pDatos.add(lEdad);

        // TEXTFIELD NOMBRE ----------------------------------------------------------------
        tEdad = sObjGraficos.construirJTextField(
            "Autor", 230, 140, 180, 30,null , null, null, sRecursos.getBorder(), "c"
        );
        tEdad.addFocusListener(panelSaleBooksComponent);
        pDatos.add(tEdad);
        
        // LABEL OFICIO ----------------------------------------------------------------
        lOficio = sObjGraficos.construirJLabel(
            "Año:", 420, 100, 180, 30,null,null, sRecursos.getFontBarraTitulo(), null, "c"
        );
        pDatos.add(lOficio);

        // TEXTFIELD OFICIO ----------------------------------------------------------------
        tOficio = sObjGraficos.construirJTextField(
            "Año", 430,140, 180, 30,null , null, null, sRecursos.getBorder(), "c"
        );
        tOficio.addFocusListener(panelSaleBooksComponent);
        pDatos.add(tOficio);
        
        // LABEL TELEFONO ----------------------------------------------------------------
        lTelefono = sObjGraficos.construirJLabel(
            "Costo:", 620, 100, 180, 30,null,null, sRecursos.getFontBarraTitulo(), null, "c"
        );
        pDatos.add(lTelefono);

        // TEXTFIELD TELEFONO ----------------------------------------------------------------
        tTelefono = sObjGraficos.construirJTextField(
            "Costo", 630, 140, 180, 30,null , null, null, sRecursos.getBorder(), "c"
        );
        tTelefono.addFocusListener(panelSaleBooksComponent);
        pDatos.add(tTelefono);
        
        // LABEL EMAIL ----------------------------------------------------------------
        lEmail = sObjGraficos.construirJLabel(
            "Descripcion:", 750, 100, 180, 30,null,null, sRecursos.getFontBarraTitulo(), null, "c"
        );
        pDatos.add(lEmail);

        // TEXTFIELD EMAIL ----------------------------------------------------------------
        tEmail = sObjGraficos.construirJTextField(
            "Descripcion", 760,140, 180, 30,null , null, null, sRecursos.getBorder(), "c"
        );
        tEmail.addFocusListener(panelSaleBooksComponent);
        pDatos.add(tEmail);
    }
    
    public void crearJTable(){
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(cabecera);

        tabla = new JTable();
        tabla.setModel(modelo);
        tabla.addMouseListener(panelSaleBooksComponent);

        tabla.setRowHeight(40);
        tabla.setShowHorizontalLines(false);
        tabla.setShowVerticalLines(false);

        header = tabla.getTableHeader();
        header.setPreferredSize(new Dimension(580, 30));

        jpTabla = sObjGraficos.construirPanelBarra(tabla, 10, 10, 580, 300, Color.WHITE, null);

        header.setDefaultRenderer(sGraficosAvanzados.devolverTablaPersonalizada(
            sRecursos.getColorAzul(), null , null, Color.WHITE, sRecursos.getFontBarraTitulo()
        ));
        tabla.setDefaultRenderer(Object.class, sGraficosAvanzados.devolverTablaPersonalizada(
            Color.WHITE, sRecursos.getColorAzulClaro() , sRecursos.getColorAzulOscuro(), 
            sRecursos.getColorAzul(), sRecursos.getFontBarraTitulo()
        ));
        
        
        jpTabla.getVerticalScrollBar().setUI(
            sGraficosAvanzados.devolverScrollPersonalizado(
                7, 10, Color.WHITE, Color.GRAY, sRecursos.getColorAzul()
            )
        );
        pCorner = new JPanel();
        pCorner.setBackground(sRecursos.getColorAzul());
        jpTabla.setCorner(JScrollPane.UPPER_RIGHT_CORNER, pCorner);
        pTabla.add(jpTabla);
    }

    public JButton getbMostrar() {
        return bMostrar;
    }

    public JButton getbInsertar() {
        return bInsertar;
    }

    public JButton getbFiltrar() {
        return bFiltrar;
    }

    public JButton getbModificar() {
        return bModificar;
    }

    public JButton getbEliminar() {
        return bEliminar;
    }

    public JLabel getlIdValor() {
        return lIdValor;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }
    
    
}
