/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloSistema;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Profesor implements Serializable{
    private Integer idProfesor;
    private Integer numeroEmpleado;
    private String nombre;
    private String password;
    private Materia materia;
    private ImagenPerfilProfesor imagenPerfilProfesor;
    
    
    
    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ImagenPerfilProfesor getImagenPerfilProfesor() {
        return imagenPerfilProfesor;
    }

    public void setImagenPerfilProfesor(ImagenPerfilProfesor imagenPerfilProfesor) {
        this.imagenPerfilProfesor = imagenPerfilProfesor;
    }
    
    
  
}
