/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloSistema;

import java.io.Serializable;

/**
 *
 * @author root
 */
public class Alumno implements Serializable{
    private Integer idAlumno;
    private Integer idProfesor;
    private Integer idCalificacion;
    private Integer idCuenta;
    private String nombre;
    private Integer cuatri;
    private String fecha;
    private Calificacion calificacion;
    private Integer cuenta;

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCuatri() {
        return cuatri;
    }

    public void setCuatri(Integer cuatri) {
        this.cuatri = cuatri;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public Integer getCuenta() {
        return cuenta;
    }
    
    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }
}
