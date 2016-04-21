/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorSistema;

import ModeloSistema.Calificacion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class PersistenciaCalificacion {
     public static Integer generarId() throws IOException, FileNotFoundException, ClassNotFoundException{
       Integer id=0;
        ArrayList<Calificacion> calificacion = new ArrayList<>();
        File f = new File("Calificaciones");
        if(f.exists())calificacion = leerCalificacion();
        if(calificacion.size()!=0) id =calificacion.get(calificacion.size()-1).getIdCalificacion()+1;
        return id;
    }
    public static void guardarCalificacion(Calificacion d) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=generarId();
        ArrayList<Calificacion> calificacion = new ArrayList<>();
        File f = new File("Calificaciones");
        if(f.exists())calificacion = leerCalificacion();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        d.setIdCalificacion(id);
        calificacion.add(d);
        oos.writeObject(calificacion);
        System.out.println("Calificaciones Guardadas");
    }
    public static ArrayList<Calificacion> leerCalificacion() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Calificacion> calificacion = new ArrayList<>();
        File f = new File("Calificaciones");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        calificacion = (ArrayList<Calificacion>) ois.readObject();
        return calificacion;
    }
}
