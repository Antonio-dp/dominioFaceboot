/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

import entidades.Publicacion;
import java.util.List;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public class PeticionPublicaciones extends Peticion {
    
    private List<Publicacion> publicaciones;

    public PeticionPublicaciones() {
    }
    
    public PeticionPublicaciones(String evento, List<Publicacion> publicaciones) {
        super(evento);
        this.publicaciones = publicaciones;
    }

    public PeticionPublicaciones(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }
    
    public PeticionPublicaciones(String evento, int status, List<Publicacion> publicaciones) {
        super(evento, status);
        this.publicaciones = publicaciones;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

}
