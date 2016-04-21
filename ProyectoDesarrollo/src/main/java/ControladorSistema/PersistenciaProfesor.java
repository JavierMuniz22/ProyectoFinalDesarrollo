/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorSistema;

import ModeloSistema.Profesor;
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
public class PersistenciaProfesor {
    public static Integer generarId() throws IOException, FileNotFoundException, ClassNotFoundException{
       Integer id=0;
        ArrayList<Profesor> profesor = new ArrayList<>();
        File f = new File("Profesor");
        if(f.exists())profesor = leerProfesor();
        if(profesor.size()!=0) id =profesor.get(profesor.size()-1).getIdProfesor()+1;
        return id;
    }
    public static void guardarDoctor(Profesor d) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=generarId();
        ArrayList<Profesor> profesor = new ArrayList<>();
        File f = new File("Profesor");
        if(f.exists())profesor = leerProfesor();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        d.setIdProfesor(id);
        profesor.add(d);
        oos.writeObject(profesor);
        System.out.println("Profesor Guardado");
    }
    public static ArrayList<Profesor> leerProfesor() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Profesor> profesor = new ArrayList<>();
        File f = new File("Profesor");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        profesor = (ArrayList<Profesor>) ois.readObject();
        return profesor;
    }
}
