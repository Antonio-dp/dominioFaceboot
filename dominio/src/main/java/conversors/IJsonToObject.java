/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversors;

import entidades.Comentario;
import entidades.Hashtag;
import entidades.Notificacion;
import entidades.Publicacion;
import peticiones.Peticion;
import entidades.Usuario;
import java.util.List;
import peticiones.PeticionComentario;
import peticiones.PeticionComentarios;
import peticiones.PeticionHashtag;
import peticiones.PeticionHashtags;
import peticiones.PeticionId;
import peticiones.PeticionNotificacion;
import peticiones.PeticionNotificaciones;
import peticiones.PeticionPublicacion;
import peticiones.PeticionPublicaciones;
import peticiones.PeticionString;
import peticiones.PeticionUsuario;

/**
 *
 * @author jegav
 */
public interface IJsonToObject {
    public Comentario convertirComentario(String comentario);
    public Usuario convertirUsuario(String usuario);
    public Publicacion convertirPublicacion(String publicacion);
    public List<Publicacion> convertirPublicaciones(String publicaciones);
    public List<Comentario> convertirComentarios(String comentarios);
    public Boolean convertirBoolean(String bool);
    public Usuario[] convertirUsuarios(String usuarios);
    public PeticionUsuario convertirPeticionUsuario(String peticionUsuario);
    public PeticionPublicacion convertirPeticionPublicacion(String peticionPublicacion);
    public PeticionPublicaciones convertirPeticionPublicaciones(String peticionPublicaciones);
    public PeticionComentarios convertirPeticionComentarios(String peticionComentarios);
    public PeticionComentario convertirPeticionComentario(String peticionComentario);
    public PeticionString convertirPeticionString(String peticionString);
    public Peticion convertirPeticion(String peticion);
    public String convertirObjetoString(Object objeto);
    public PeticionId convertirPeticionId(String peticion);
    public PeticionHashtags convertirPeticionHashtags(String hashtags);
    public PeticionNotificacion convertirNotificacion(String notificacion);
   public PeticionHashtag convertirPeticionHashtag(String peticion); 
   public PeticionNotificaciones convertirPeticionNotificaciones(String peticion);
}
