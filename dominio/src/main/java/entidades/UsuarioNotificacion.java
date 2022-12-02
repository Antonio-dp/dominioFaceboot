///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package entidades;
//
//import java.io.Serializable;
//import java.util.Objects;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "usuariosNotificaciones")
//public class UsuarioNotificacion implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idUsuario")
//    private Usuario usuario;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idNotificacion")
//    private Notificacion notificacion;
//
//    public UsuarioNotificacion() {
//    }
//
//    public UsuarioNotificacion(Usuario usuario, Notificacion notificacion) {
//        this.usuario = usuario;
//        this.notificacion = notificacion;
//    }
//
//    public UsuarioNotificacion(Integer id, Usuario usuario, Notificacion notificacion) {
//        this.id = id;
//        this.usuario = usuario;
//        this.notificacion = notificacion;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
//
//    public Notificacion getNotificacion() {
//        return notificacion;
//    }
//
//    public void setNotificacion(Notificacion notificacion) {
//        this.notificacion = notificacion;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 17 * hash + Objects.hashCode(this.id);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final UsuarioNotificacion other = (UsuarioNotificacion) obj;
//        return Objects.equals(this.id, other.id);
//    }
//    
//    
//    
//}//end class

