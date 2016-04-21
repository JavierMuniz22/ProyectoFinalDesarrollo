/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorSistema;

import ModeloSistema.Alumno;
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
public class PersistenciaAlumno {
    public static Integer getIdAlumno() throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=0;
        ArrayList<Alumno> alumno = new ArrayList<>();
        File f = new File("Alumno");
        if(f.exists())alumno = leerAlumno();
        if(alumno.size()!=0)id = alumno.get(alumno.size()-1).getIdAlumno()+1;
        return id;
    }
    public static void guardarPaciente(Alumno p) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=getIdAlumno();
        ArrayList<Alumno> alumno = new ArrayList<>();
        File f = new File("Alumno");
        if(f.exists())alumno = leerAlumno();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        p.setIdAlumno(id);
        alumno.add(p);
        oos.writeObject(alumno);
        System.out.println("Alumno Registrado");
    }
    public static ArrayList<Alumno> leerAlumno() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Alumno> alumno = new ArrayList<>();
        File f = new File("Alumno");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        alumno = (ArrayList<Alumno>) ois.readObject();
        return alumno;
        
    }
}
