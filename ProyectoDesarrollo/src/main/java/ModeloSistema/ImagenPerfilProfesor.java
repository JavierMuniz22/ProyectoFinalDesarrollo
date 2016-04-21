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
public class ImagenPerfilProfesor implements Serializable{
    private Integer idImagenPerfilProfesor;
    private Integer idProfesor;
    private byte [] imagen;

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Integer getIdImagenPerfilProfesor() {
        return idImagenPerfilProfesor;
    }

    public void setIdImagenPerfilProfesor(Integer idImagenPerfilProfesor) {
        this.idImagenPerfilProfesor = idImagenPerfilProfesor;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }
    
}
