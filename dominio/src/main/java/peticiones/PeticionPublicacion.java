/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

import entidades.Publicacion;

/**
 *
 * @author jegav
 */
public class PeticionPublicacion extends Peticion {
    private Publicacion publicacion;

    public PeticionPublicacion() {
    }

    public PeticionPublicacion(String evento, Publicacion publicacion) {
        super(evento);
        this.publicacion = publicacion;
    }

    public PeticionPublicacion(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }
    
    public PeticionPublicacion(String evento, int status, Publicacion publicacion) {
        super(evento, status);
        this.publicacion = publicacion;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
    
}
