/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.services.ServicesLogic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import models.Tarjeta;

/**
 *
 * @author Emmanuel
 */
public class TarjetaService {

    private static TarjetaService servicio;
    private ArrayList<Tarjeta> tarjetas;
    
    public TarjetaService(){
        tarjetas = new ArrayList<Tarjeta>();
        cargarDatos();
    }

    public static TarjetaService getService() {
        if (servicio == null) 
            servicio = new TarjetaService();
        
        return servicio;
    }
    
    public void cargarDatos(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File ("src/archivos/tarjetas.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null){
                String[] atributos = linea.split(",");
                Tarjeta tarjeta = new Tarjeta();
                tarjeta.setNombreTarjeta(atributos[0]);
                tarjeta.setValor(atributos[1]);
                tarjeta.setImagenTarjeta(new ImageIcon(atributos[2]));
                tarjetas.add(tarjeta);
            }
            fr.close(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Tarjeta devolverTarjeta(int posicion){
        try{
            return tarjetas.get(posicion);
        }
        catch(Exception e){
            return null;
        }
    }

}
