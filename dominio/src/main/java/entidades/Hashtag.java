/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
@Entity
@Table(name = "hashtags")
public class Hashtag implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany(mappedBy = "hashtagPublicacion")
    private List<Publicacion> hashtags;
    
//    @OneToMany(mappedBy = "hashtag", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<HashtagPublicacion> hashtag;

    @Column(name = "tema")
    private String tema;

    public Hashtag() {
    }

    public Hashtag(String tema) {
        this.tema = tema;
    }

    public Hashtag(Integer id, String tema) {
        this.id = id;
        this.tema = tema;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public List<Publicacion> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Publicacion> hashtags) {
        this.hashtags = hashtags;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
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
        final Hashtag other = (Hashtag) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return tema;
    }

}//end class
