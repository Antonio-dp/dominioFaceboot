/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public class Peticion {
    
    private String evento;
    private String mensajeError;
    private int status;

    public Peticion() {
    }

    public Peticion(String evento) {
        this.evento = evento;
    }
    
    public Peticion(String evento, int status) {
        this.evento = evento;
        this.status = status;
    }

    public Peticion(String evento, int status, String mensajeError) {
        this.evento = evento;
        this.mensajeError = mensajeError;
        this.status = status;
    }
    
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public int getStatus() {
        return status;
    }
}
