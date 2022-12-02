/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import enumeradores.MotorEnvio;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "notificaciones")
public class Notificacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idUsuario")
    private Usuario remitente;
    
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idDestinatario")
    private Usuario destinatario;

    @Column(name = "fechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaCreacion;
    
    @Column (name = "motorEnvio")
    @Enumerated (EnumType.STRING)
    private MotorEnvio motorEnvio;
    
    @Column (name = "contenido")
    private String contenido;

    public Notificacion() {
    }

    public Notificacion(Usuario usuario, Calendar fechaCreacion, MotorEnvio motorEnvio) {
        this.remitente = usuario;
        this.fechaCreacion = fechaCreacion;
        this.motorEnvio = motorEnvio;
    }

    public Notificacion(Integer id, Usuario usuario, Calendar fechaCreacion, MotorEnvio motorEnvio) {
        this.id = id;
        this.remitente = usuario;
        this.fechaCreacion = fechaCreacion;
        this.motorEnvio = motorEnvio;
    }

    public Notificacion(Usuario usuario, Usuario destinatario, Calendar fechaCreacion, MotorEnvio motorEnvio, String contenido) {
        this.remitente = usuario;
        this.destinatario = destinatario;
        this.fechaCreacion = fechaCreacion;
        this.motorEnvio = motorEnvio;
        this.contenido = contenido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getRemitente() {
        return remitente;
    }

    public void setRemitente(Usuario remitente) {
        this.remitente = remitente;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public MotorEnvio getMotorEnvio() {
        return motorEnvio;
    }

    public void setMotorEnvio(MotorEnvio motorEnvio) {
        this.motorEnvio = motorEnvio;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final Notificacion other = (Notificacion) obj;
        return Objects.equals(this.id, other.id);
    }
    
} //end of class
