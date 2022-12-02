/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

import entidades.Notificacion;
import java.util.List;

/**
 *
 * @author jegav
 */
public class PeticionNotificaciones extends Peticion{
    private List<Notificacion> notificaciones;

    public PeticionNotificaciones() {
    }
    
    public PeticionNotificaciones(String evento, List<Notificacion> notificaciones) {
        super(evento);
        this.notificaciones = notificaciones;
    }

    public PeticionNotificaciones(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }
    
    public PeticionNotificaciones(String evento, int status, List<Notificacion> notificaciones) {
        super(evento, status);
        this.notificaciones = notificaciones;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setPublicaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }
}
