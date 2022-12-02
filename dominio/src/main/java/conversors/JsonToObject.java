/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import entidades.Comentario;
import entidades.Hashtag;
import entidades.Notificacion;
import entidades.Publicacion;
import peticiones.Peticion;
import entidades.Usuario;
import java.util.ArrayList;
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
 * @author jegav
 */
public class JsonToObject implements IJsonToObject {

    private ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @Override
    public Comentario convertirComentario(String comentario) {
        try {
            return objectMapper.readValue(comentario, Comentario.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Usuario convertirUsuario(String usuario) {
        try {
            return objectMapper.readValue(usuario, Usuario.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Usuario[] convertirUsuarios(String usuarios) {
        try {

            return objectMapper.readValue(usuarios, Usuario[].class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public String convertirObjetoString(Object objeto) {
        try {
            return objectMapper.writeValueAsString(objeto);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    @Override
    public Boolean convertirBoolean(String bool) {
        try {
            return objectMapper.readValue(bool, Boolean.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Publicacion convertirPublicacion(String publicacion) {
        try {
            return objectMapper.readValue(publicacion, Publicacion.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Publicacion> convertirPublicaciones(String publicaciones) {
        try {
            return Arrays.asList(objectMapper.readValue(publicaciones, Publicacion[].class));
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Comentario> convertirComentarios(String comentarios) {
        try {
            return Arrays.asList(objectMapper.readValue(comentarios, Comentario[].class));
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionUsuario convertirPeticionUsuario(String peticionUsuario) {
        try {
            return objectMapper.readValue(peticionUsuario, PeticionUsuario.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionPublicaciones convertirPeticionPublicaciones(String peticionPublicaciones) {
        try {
            return objectMapper.readValue(peticionPublicaciones, PeticionPublicaciones.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Peticion convertirPeticion(String peticion) {
        try {
            return objectMapper.readValue(peticion, Peticion.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionPublicacion convertirPeticionPublicacion(String peticionPublicacion) {
        try {
            return objectMapper.readValue(peticionPublicacion, PeticionPublicacion.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionId convertirPeticionId(String peticion) {
        try {
            return objectMapper.readValue(peticion, PeticionId.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionComentario convertirPeticionComentario(String peticionComentario) {
        try {
            return objectMapper.readValue(peticionComentario, PeticionComentario.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionComentarios convertirPeticionComentarios(String peticionComentarios) {
        try {
            return objectMapper.readValue(peticionComentarios, PeticionComentarios.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionHashtags convertirPeticionHashtags(String hashtags) {
        try {
            return objectMapper.readValue(hashtags, PeticionHashtags.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionNotificacion convertirNotificacion(String notificacion) {
        try {
            return objectMapper.readValue(notificacion, PeticionNotificacion.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionString convertirPeticionString(String peticionString) {
        try {
            return objectMapper.readValue(peticionString, PeticionString.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PeticionHashtag convertirPeticionHashtag(String peticion) {
        try {
            return objectMapper.readValue(peticion, PeticionHashtag.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

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
