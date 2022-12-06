/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import enumeradores.Sexo;
import java.util.Calendar;
import java.util.Objects;
import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "idFb", length = 20)
    private String idFb;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "password", length = 45)
    private String password;

    @Column(name = "email", length = 200)
    private String email;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Column(name = "Sexo")
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(name = "fechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaNacimiento;

    @OneToMany(fetch = FetchType.EAGER, cascade ={CascadeType.PERSIST, CascadeType.DETACH}, mappedBy="usuario")
    private List<Publicacion> publicaciones;
    
    @JsonIgnore
    @OneToMany(mappedBy = "remitente", cascade = {CascadeType.MERGE, CascadeType.DETACH})
    private List<Notificacion> notificacionesRemitente;

    @JsonIgnore
    @OneToMany(mappedBy = "destinatario", cascade = {CascadeType.MERGE, CascadeType.DETACH})
    private List<Notificacion> notificacionesDestinatario;
    
    public Usuario() {
    }

    public Usuario(String email, String password) {
        this.password = password;
        this.email = email;
    }

    public Usuario(String idFb, String nombre, String email) {
        this.idFb = idFb;
        this.nombre = nombre;
        this.email = email;
    }

    public Usuario(String nombre, String password, String email, String telefono, Sexo sexo, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario(String nombre, String password, String email, String telefono, Sexo sexo, Calendar fechaNacimiento, List<Publicacion> publicaciones) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario(Integer id, String idFb, String nombre, String password, String email, String telefono, Sexo sexo, Calendar fechaNacimiento) {
        this.id = id;
        this.idFb = idFb;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario(String nombre, String email, String telefono, Sexo sexo, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdFb() {
        return idFb;
    }

    public void setIdFb(String idFb) {
        this.idFb = idFb;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public List<Notificacion> getNotificacionesRemitente() {
        return notificacionesRemitente;
    }

    public void setNotificacionesRemitente(List<Notificacion> notificacionesRemitente) {
        this.notificacionesRemitente = notificacionesRemitente;
    }

    public List<Notificacion> getNotificacionesDestinatario() {
        return notificacionesDestinatario;
    }

    public void setNotificacionesDestinatario(List<Notificacion> notificacionesDestinatario) {
        this.notificacionesDestinatario = notificacionesDestinatario;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre;
    }

}//end class