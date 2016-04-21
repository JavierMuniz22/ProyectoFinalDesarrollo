/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorSistema;

import ModeloSistema.ImagenPerfilProfesor;
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
public class PersistenciaImagenPerfilProfesor {
    public static Integer generarId() throws IOException, FileNotFoundException, ClassNotFoundException{
       Integer id=0;
        ArrayList<ImagenPerfilProfesor> imagenPerfilProfesor = new ArrayList<>();
        File f = new File("ImagenPerfilProfesor");
        if(f.exists())imagenPerfilProfesor = leerImagenPerfilProfesor();
        if(imagenPerfilProfesor.size()!=0) id =imagenPerfilProfesor.get(imagenPerfilProfesor.size()-1).getIdImagenPerfilProfesor()+1;
        return id;
    }
    public static void guardarImagenPerfilDoctor(ImagenPerfilProfesor d) throws IOException, FileNotFoundException, ClassNotFoundException{
        Integer id=generarId();
        ArrayList<ImagenPerfilProfesor> imagenPerfilProfesor = new ArrayList<>();
        File f = new File("ImagenPerfilProfesor");
        if(f.exists())imagenPerfilProfesor = leerImagenPerfilProfesor();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        d.setIdImagenPerfilProfesor(id);
        imagenPerfilProfesor.add(d);
        oos.writeObject(imagenPerfilProfesor);
        System.out.println("Imagen Guardada");
    }
    public static ArrayList<ImagenPerfilProfesor> leerImagenPerfilProfesor() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<ImagenPerfilProfesor> imagenPerfilProfesor = new ArrayList<>();
        File f = new File("ImagenPerfilProfesor");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        imagenPerfilProfesor = (ArrayList<ImagenPerfilProfesor>) ois.readObject();
        return imagenPerfilProfesor;
    }
}
