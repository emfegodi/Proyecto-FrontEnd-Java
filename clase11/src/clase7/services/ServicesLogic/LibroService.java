/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.services.ServicesLogic;

import java.util.ArrayList;
import logic.ControlLibros;
import models.Libro;

/**
 *
 * @author Emmanuel
 */
public class LibroService {
    private static LibroService servicio;
    private ControlLibros cLibros;
    private ArrayList<Libro> libros;
    
    public LibroService(){
        cLibros = new ControlLibros();
        libros = cLibros.getLibros();
    }

    public Libro devolverLibro(int posicion){
        try{
            return libros.get(posicion);
        }
        catch(Exception e){
            return null;
        }
    }
    
    public void AgregarLibro(Libro libro){
        this.libros.add(libro);
    }
    
    public int devolverCantLibros(){
        return this.libros.size();
    }
    public static LibroService getServicio() {
        if(servicio==null)
            servicio= new LibroService();
        return servicio;
    }
    
    
    
}
