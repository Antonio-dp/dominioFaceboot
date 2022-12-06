/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

import entidades.Notificacion;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public class PeticionNotificacion extends Peticion{
    private Notificacion notificacion;

    public PeticionNotificacion() {
    }

    public PeticionNotificacion(String evento, int status, Notificacion notificacion) {
        super(evento, status);
        this.notificacion = notificacion;
    }

    public PeticionNotificacion(String evento, Notificacion notificacion) {
        super(evento);
        this.notificacion = notificacion;
    }

    public PeticionNotificacion(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

}
