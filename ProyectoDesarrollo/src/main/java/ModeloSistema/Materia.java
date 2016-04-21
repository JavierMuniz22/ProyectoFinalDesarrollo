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
public class Materia implements Serializable{
    private Integer idMateria;
    private Integer idProfesor;
    private Integer materia;
    private String turno;
       

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer materia) {
        this.idMateria = materia;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getMateria() {
        return materia;
    }

    public void setMateria(Integer materia) {
        this.materia = materia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
    
    
}
