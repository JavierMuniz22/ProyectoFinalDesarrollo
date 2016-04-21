/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorSistema;

import ModeloSistema.Materia;
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
public class PersistenciaMateria {
     public static Integer generarId() throws IOException, FileNotFoundException, ClassNotFoundException{
       Integer id=0;
        ArrayList<Materia> materia = new ArrayList<>();
        File f = new File("Materia");
        if(f.exists())materia = leerMateria();
        if(materia.size()!=0) id =materia.get(materia.size()-1).getIdMateria()+1;
        return id;
    }
    public static void guardarAreasDoctor(Materia d) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=generarId();
        ArrayList<Materia> materia = new ArrayList<>();
        File f = new File("Materia");
        if(f.exists())materia = leerMateria();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        d.setIdMateria(id);
        materia.add(d);
        oos.writeObject(materia);
        System.out.println("Materia Guardada");
    }
    public static ArrayList<Materia> leerMateria() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Materia> materia = new ArrayList<>();
        File f = new File("Materia");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        materia = (ArrayList<Materia>) ois.readObject();
        return materia;
    }
}
