/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import models.Libro;
import models.Usuario;

/**
 *
 * @author Emmanuel
 */
public class ControlLibros {
    private ArrayList<Libro> libros;
    
    public ControlLibros(){
        libros = new ArrayList<Libro>();
        cargarDatos();
    }
    
    public void cargarDatos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("src/archivos/libros.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] atributos = linea.split(",");
                Libro libro = new Libro();
                libro.setId(Integer.parseInt(atributos[0]));
                libro.setNombre(atributos[1]);
                libro.setAutor(atributos[2]);
                libro.setAño(atributos[3]);
                libro.setCosto(atributos[4]);
                libro.setDescripcion(atributos[5]);
                libros.add(libro);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
}
