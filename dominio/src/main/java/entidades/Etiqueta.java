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
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//import java.util.List;
///**
// *
// * @author Usuario
// */
//@Entity
//@Table(name = "etiquetas")
//
//public class Etiqueta implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(name = "indice", length = 100)
//    private String indice;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idHashtag")
//    private Hashtag hashtag;
//    
////    @ManyToMany(mappedBy = "etiquetasPublicacion")
////    private List<Publicacion> publicaciones;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idEtiquetaUsuario")
//    private EtiquetaUsuario etiquetaUsuario;
//
//    public Etiqueta() {
//    }
//
//    public Etiqueta(String indice, Hashtag hashtag, EtiquetaUsuario etiquetaUsuario) {
//        this.indice = indice;
//        this.hashtag = hashtag;
//        this.etiquetaUsuario = etiquetaUsuario;
//    }
//
//    public Etiqueta(Integer id, String indice, Hashtag hashtag, EtiquetaUsuario etiquetaUsuario, List<EtiquetaPublicacion> publicaciones) {
//        this.id = id;
//        this.indice = indice;
//        this.hashtag = hashtag;
//        this.etiquetaUsuario = etiquetaUsuario;
//        //this.publicaciones = publicaciones;
//    }
//
//    public Etiqueta(String indice, Hashtag hashtag) {
//        this.indice = indice;
//        this.hashtag = hashtag;
//    }
//
//    public Etiqueta(String indice, EtiquetaUsuario etiquetaUsuario) {
//        this.indice = indice;
//        this.etiquetaUsuario = etiquetaUsuario;
//    }
//
//    public Etiqueta(Integer id, String indice, Hashtag hashtag) {
//        this.id = id;
//        this.indice = indice;
//        this.hashtag = hashtag;
//    }
//
//    public Etiqueta(Integer id, String indice, EtiquetaUsuario etiquetaUsuario) {
//        this.id = id;
//        this.indice = indice;
//        this.etiquetaUsuario = etiquetaUsuario;
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
//    public String getIndice() {
//        return indice;
//    }
//
//    public void setIndice(String indice) {
//        this.indice = indice;
//    }
//
//    public Hashtag getHashtag() {
//        return hashtag;
//    }
//
//    public void setHashtag(Hashtag hashtag) {
//        this.hashtag = hashtag;
//    }
//
//    public EtiquetaUsuario getEtiquetaUsuario() {
//        return etiquetaUsuario;
//    }
//
//    public void setEtiquetaUsuario(EtiquetaUsuario etiquetaUsuario) {
//        this.etiquetaUsuario = etiquetaUsuario;
//    }
//    
////    public List<EtiquetaPublicacion> getPublicaciones() {
////        return publicaciones;
////    }
////
////    public void setPublicaciones(List<EtiquetaPublicacion> publicaciones) {
////        this.publicaciones = publicaciones;
////    }
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 67 * hash + Objects.hashCode(this.id);
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
//        final Etiqueta other = (Etiqueta) obj;
//        return Objects.equals(this.id, other.id);
//    }
//
//    @Override
//    public String toString() {
//        return indice;
//    }
//    
//    

//}//end class
