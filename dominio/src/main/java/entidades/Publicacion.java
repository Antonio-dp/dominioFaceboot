package entidades;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.Calendar;
import java.util.Objects;
import jakarta.persistence.*;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.IntSequenceGenerator.class,
        property = "@id",
        scope = Publicacion.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "publicaciones")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publicacion")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "publicacion_etiqueta",
            joinColumns = @JoinColumn(name = "publicacion_id"),
            inverseJoinColumns = @JoinColumn(name = "etiqueta_id")
    )
    private List<EtiquetaUsuario> etiquetasPublicacion;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(
            name = "publicacion_hashtag",
            joinColumns = @JoinColumn(name = "publicacion_id"),
            inverseJoinColumns = @JoinColumn(name = "hashtag_id")
    )
    private List<Hashtag> hashtagPublicacion;

    @Column(name = "fecha")
    private Calendar fecha;

    @Column(name = "texto")
    private String texto;

    @Column(name = "imagen")
    private String imagen;

    @OneToMany(mappedBy = "publicacion", cascade = {CascadeType.PERSIST, CascadeType.DETACH}, fetch = FetchType.EAGER)
    private List<Comentario> comentarios;


    public Publicacion() {
    }

    public Publicacion(Integer id) {
        this.id = id;
    }

    public Publicacion(Usuario usuario, Calendar fecha, String texto, String imagen) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.texto = texto;
        this.imagen = imagen;
    }

    public Publicacion(Usuario usuario, Calendar fecha, String texto, String imagen, List<Hashtag> hashtags) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.texto = texto;
        this.imagen = imagen;
        this.hashtagPublicacion = hashtags;
    }

    public Publicacion(Usuario usuario, Calendar fecha, String texto) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.texto = texto;
    }

    public Integer getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }


    public List<Hashtag> getHashtagPublicacion() {
        return hashtagPublicacion;
    }

    public void setHashtagPublicacion(List<Hashtag> hashtagPublicacion) {
        this.hashtagPublicacion = hashtagPublicacion;
    }

    public List<EtiquetaUsuario> getEtiquetasPublicacion() {
        return etiquetasPublicacion;
    }

    public void setEtiquetasPublicacion(List<EtiquetaUsuario> etiquetasPublicacion) {
        this.etiquetasPublicacion = etiquetasPublicacion;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Publicacion that = (Publicacion) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}