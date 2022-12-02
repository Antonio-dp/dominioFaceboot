/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

import entidades.Comentario;
import java.util.List;

/**
 *
 * @author tonyd
 */
public class PeticionComentarios extends Peticion{
    private List<Comentario> comentarios;

    public PeticionComentarios() {
    }
    
    public PeticionComentarios(String evento, List<Comentario> comentarios) {
        super(evento);
        this.comentarios = comentarios;
    }

    public PeticionComentarios(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }
    
    public PeticionComentarios(String evento, int status, List<Comentario> comentarios) {
        super(evento, status);
        this.comentarios = comentarios;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
