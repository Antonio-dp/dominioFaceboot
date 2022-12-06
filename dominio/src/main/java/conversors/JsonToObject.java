/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import entidades.Comentario;
import entidades.Publicacion;
import peticiones.Peticion;
import entidades.Usuario;
import java.util.Arrays;
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
public class JsonToObject implements IJsonToObject {

    /**
     * Variable ObjectMapper de la clase
     */
    private ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    /**
     * Método que se encarga de convertir a comentario un string
     * @param comentario a convertir
     * @return Comentario convertido
     */
    @Override
    public Comentario convertirComentario(String comentario) {
        try {
            return objectMapper.readValue(comentario, Comentario.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a usuario
     * @param usuario string a convertir
     * @return usuario convertido
     */
    @Override
    public Usuario convertirUsuario(String usuario) {
        try {
            return objectMapper.readValue(usuario, Usuario.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a un arreglo de usuarios
     * @param usuarios string a convertir a arreglo
     * @return arreglo de usuarios
     */
    @Override
    public Usuario[] convertirUsuarios(String usuarios) {
        try {

            return objectMapper.readValue(usuarios, Usuario[].class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un objeto a String
     * @param objeto a convertir 
     * @return String convertido
     */
    @Override
    public String convertirObjetoString(Object objeto) {
        try {
            return objectMapper.writeValueAsString(objeto);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    /**
     * Método que convierte un string a boolean
     * @param bool string a convertir
     * @return Boolean convertido
     */
    @Override
    public Boolean convertirBoolean(String bool) {
        try {
            return objectMapper.readValue(bool, Boolean.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a publicacion
     * @param publicacion string a convertir
     * @return publicacion convertida
     */
    @Override
    public Publicacion convertirPublicacion(String publicacion) {
        try {
            return objectMapper.readValue(publicacion, Publicacion.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a una lista de publicaciones
     * @param publicaciones string a convertir
     * @return lista de publicaciones convertidas
     */
    @Override
    public List<Publicacion> convertirPublicaciones(String publicaciones) {
        try {
            return Arrays.asList(objectMapper.readValue(publicaciones, Publicacion[].class));
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a comentarios
     * @param comentarios string a convertir
     * @return Lista de comentarios convertidas
     */
    @Override
    public List<Comentario> convertirComentarios(String comentarios) {
        try {
            return Arrays.asList(objectMapper.readValue(comentarios, Comentario[].class));
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticion usuario
     * @param peticionUsuario string a convertir
     * @return peticionUsuario convertida
     */
    @Override
    public PeticionUsuario convertirPeticionUsuario(String peticionUsuario) {
        try {
            return objectMapper.readValue(peticionUsuario, PeticionUsuario.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticion publicaciones
     * @param peticionPublicaciones string a convertir
     * @return peticionPublicaciones convertido
     */
    @Override
    public PeticionPublicaciones convertirPeticionPublicaciones(String peticionPublicaciones) {
        try {
            return objectMapper.readValue(peticionPublicaciones, PeticionPublicaciones.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a Peticion
     * @param peticion string a convertir
     * @return Peticion convertida
     */
    @Override
    public Peticion convertirPeticion(String peticion) {
        try {
            return objectMapper.readValue(peticion, Peticion.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticion publicacion
     * @param peticionPublicacion string a convertir
     * @return peticionPublicacion convertida
     */
    @Override
    public PeticionPublicacion convertirPeticionPublicacion(String peticionPublicacion) {
        try {
            return objectMapper.readValue(peticionPublicacion, PeticionPublicacion.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticionId
     * @param peticion string a convertir
     * @return PeticionId convertido
     */
    @Override
    public PeticionId convertirPeticionId(String peticion) {
        try {
            return objectMapper.readValue(peticion, PeticionId.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticion comentario
     * @param peticionComentario string a convertir
     * @return peticionComentario convertido
     */
    @Override
    public PeticionComentario convertirPeticionComentario(String peticionComentario) {
        try {
            return objectMapper.readValue(peticionComentario, PeticionComentario.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticion comentarios
     * @param peticionComentarios string a convertir
     * @return peticionComentarios convertido
     */
    @Override
    public PeticionComentarios convertirPeticionComentarios(String peticionComentarios) {
        try {
            return objectMapper.readValue(peticionComentarios, PeticionComentarios.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticion hashtags
     * @param hashtags string a convertir
     * @return PeticionHashtags convertido
     */
    @Override
    public PeticionHashtags convertirPeticionHashtags(String hashtags) {
        try {
            return objectMapper.readValue(hashtags, PeticionHashtags.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticion notificacion
     * @param notificacion string a convertir
     * @return PeticionNotificacion convertido
     */
    @Override
    public PeticionNotificacion convertirNotificacion(String notificacion) {
        try {
            return objectMapper.readValue(notificacion, PeticionNotificacion.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticionString
     * @param peticionString string a convertir
     * @return peticionString convertido
     */
    @Override
    public PeticionString convertirPeticionString(String peticionString) {
        try {
            return objectMapper.readValue(peticionString, PeticionString.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Método que convierte un string a peticion hashtag
     * @param peticion string a convertir
     * @return PeticionHashtag convertido
     */
    @Override
    public PeticionHashtag convertirPeticionHashtag(String peticion) {
        try {
            return objectMapper.readValue(peticion, PeticionHashtag.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
    * Método que convierte un string a peticionNotificaciones
    * @param peticion string a convertir
    * @return PeticionNotificaciones convertido
    */
    @Override
    public PeticionNotificaciones convertirPeticionNotificaciones(String peticion) {
        try {
            return objectMapper.readValue(peticion, PeticionNotificaciones.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}