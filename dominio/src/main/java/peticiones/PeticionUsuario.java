/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;
import entidades.Usuario;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public class PeticionUsuario extends Peticion {
    
    private Usuario usuario;

    public PeticionUsuario() {
    }

    public PeticionUsuario(String evento, int status, Usuario usuario) {
        super(evento, status);
        this.usuario = usuario;
    }

    public PeticionUsuario(String evento, Usuario usuario) {
        super(evento);
        this.usuario = usuario;
    }

    public PeticionUsuario(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }    
}
