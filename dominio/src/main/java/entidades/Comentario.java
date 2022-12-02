/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "comentarios")
public class Comentario{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idPublicacion")
    private Publicacion publicacion;

    @Column(name = "fechaComentario", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaCreacion;
    
    @Column(name = "contenido")
    private String contenido;
    
    public Comentario() {
    }

    public Comentario(Usuario usuario, Publicacion publicacion, Calendar fechaPublicacion, String contenido) {
        this.usuario = usuario;
        this.publicacion = publicacion;
        this.fechaCreacion = fechaPublicacion;
        this.contenido = contenido;
    }

    public Comentario(Integer id, Usuario usuario, Publicacion publicacion, Calendar fechaPublicacion) {
        this.id = id;
        this.usuario = usuario;
        this.publicacion = publicacion;
        this.fechaCreacion = fechaPublicacion;
        this.contenido = contenido;
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

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Calendar getFechaPublicacion() {
        return fechaCreacion;
    }

    public void setFechaPublicacion(Calendar fechaPublicacion) {
        this.fechaCreacion = fechaPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comentario other = (Comentario) obj;
        return Objects.equals(this.id, other.id);
    }

    

}//end class