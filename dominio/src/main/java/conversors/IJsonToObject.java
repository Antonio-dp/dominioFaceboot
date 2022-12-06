/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversors;

import entidades.Comentario;
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
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public interface IJsonToObject {
    
    /**
     * Método que se encarga de convertir a comentario un string
     * @param comentario a convertir
     * @return Comentario convertido
     */
    public Comentario convertirComentario(String comentario);
    
    /**
     * Método que convierte un string a usuario
     * @param usuario string a convertir
     * @return usuario convertido
     */
    public Usuario convertirUsuario(String usuario);
    
    /**
     * Método que convierte un string a publicacion
     * @param publicacion string a convertir
     * @return publicacion convertida
     */
    public Publicacion convertirPublicacion(String publicacion);
    
    /**
     * Método que convierte un string a una lista de publicaciones
     * @param publicaciones string a convertir
     * @return lista de publicaciones convertidas
     */
    public List<Publicacion> convertirPublicaciones(String publicaciones);
    
    /**
     * Método que convierte un string a comentarios
     * @param comentarios string a convertir
     * @return Lista de comentarios convertidas
     */
    public List<Comentario> convertirComentarios(String comentarios);
    
    /**
     * Método que convierte un string a boolean
     * @param bool string a convertir
     * @return Boolean convertido
     */
    public Boolean convertirBoolean(String bool);
    
    /**
     * Método que convierte un string a un arreglo de usuarios
     * @param usuarios string a convertir a arreglo
     * @return arreglo de usuarios
     */
    public Usuario[] convertirUsuarios(String usuarios);
    
    /**
     * Método que convierte un string a peticion usuario
     * @param peticionUsuario string a convertir
     * @return peticionUsuario convertida
     */
    public PeticionUsuario convertirPeticionUsuario(String peticionUsuario);
    
    /**
     * Método que convierte un string a peticion publicacion
     * @param peticionPublicacion string a convertir
     * @return peticionPublicacion convertida
     */
    public PeticionPublicacion convertirPeticionPublicacion(String peticionPublicacion);
    
    /**
     * Método que convierte un string a peticion publicaciones
     * @param peticionPublicaciones string a convertir
     * @return peticionPublicaciones convertido
     */
    public PeticionPublicaciones convertirPeticionPublicaciones(String peticionPublicaciones);
    
    /**
     * Método que convierte un string a peticion comentarios
     * @param peticionComentarios string a convertir
     * @return peticionComentarios convertido
     */
    public PeticionComentarios convertirPeticionComentarios(String peticionComentarios);
    
    /**
     * Método que convierte un string a peticion comentario
     * @param peticionComentario string a convertir
     * @return peticionComentario convertido
     */
    public PeticionComentario convertirPeticionComentario(String peticionComentario);
    
    /**
     * Método que convierte un string a peticionString
     * @param peticionString string a convertir
     * @return peticionString convertido
     */
    public PeticionString convertirPeticionString(String peticionString);
    
    /**
     * Método que convierte un string a Peticion
     * @param peticion string a convertir
     * @return Peticion convertida
     */
    public Peticion convertirPeticion(String peticion);
    
    /**
     * Método que convierte un objeto a String
     * @param objeto a convertir 
     * @return String convertido
     */
    public String convertirObjetoString(Object objeto);
    
    /**
     * Método que convierte un string a peticionId
     * @param peticion string a convertir
     * @return PeticionId convertido
     */
    public PeticionId convertirPeticionId(String peticion);
    
    /**
     * Método que convierte un string a peticion hashtags
     * @param hashtags string a convertir
     * @return PeticionHashtags convertido
     */
    public PeticionHashtags convertirPeticionHashtags(String hashtags);
    
    /**
     * Método que convierte un string a peticion notificacion
     * @param notificacion string a convertir
     * @return PeticionNotificacion convertido
     */
    public PeticionNotificacion convertirNotificacion(String notificacion);
    
    /**
     * Método que convierte un string a peticion hashtag
     * @param peticion string a convertir
     * @return PeticionHashtag convertido
     */
   public PeticionHashtag convertirPeticionHashtag(String peticion); 
   
   /**
    * Método que convierte un string a peticionNotificaciones
    * @param peticion string a convertir
    * @return PeticionNotificaciones convertido
    */
   public PeticionNotificaciones convertirPeticionNotificaciones(String peticion);
}
