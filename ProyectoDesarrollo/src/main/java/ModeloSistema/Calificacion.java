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
public class Calificacion implements Serializable{
    private Integer calificacion;
    private Integer idAlumno;
    private String fecha;
    private String materia;
    private String tratamineto;
    private Integer idCalificacion;
    
      public Integer getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTratamineto() {
        return tratamineto;
    }

    public void setTratamineto(String tratamineto) {
        this.tratamineto = tratamineto;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }
   
}
