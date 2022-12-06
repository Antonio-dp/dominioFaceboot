/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

import entidades.Comentario;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public class PeticionComentario extends Peticion {
    private Comentario comentario;

    public PeticionComentario() {
    }

    public PeticionComentario(String evento, int status, Comentario comentario) {
        super(evento, status);
        this.comentario = comentario;
    }

    public PeticionComentario(String evento, Comentario comentario) {
        super(evento);
        this.comentario = comentario;
    }

    public PeticionComentario(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }
    
    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    } 
}
