///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package entidades;
//
//import java.io.Serializable;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
///**
// *
// * @author Usuario
// */
//@Entity
//@Table(name = "etiquetasPublicaciones")
//public class HashtagPublicacion implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idHashtag")
//    private Hashtag hashtag;
//    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idPublicacion")
//    private Publicacion publicacion;
//
//    public HashtagPublicacion() {
//    }
//
//    public HashtagPublicacion(Hashtag hashtag, Publicacion publicacion) {
//        this.hashtag = hashtag;
//        this.publicacion = publicacion;
//    }
//
//    public Integer getId() {
//        return id;
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
//    public Publicacion getPublicacion() {
//        return publicacion;
//    }
//
//    public void setPublicacion(Publicacion publicacion) {
//        this.publicacion = publicacion;
//    }
//    
//    
//}//end class