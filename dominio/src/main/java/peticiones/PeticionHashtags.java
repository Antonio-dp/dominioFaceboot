/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

import entidades.Hashtag;
import java.util.List;

/**
 *
 * @author tonyd
 */
public class PeticionHashtags extends Peticion {

    private List<Hashtag> hashtag;

    public PeticionHashtags() {
    }

    public PeticionHashtags(String evento, int status, List<Hashtag> hashtag) {
        super(evento, status);
        this.hashtag = hashtag;
    }

    public PeticionHashtags(String evento, List<Hashtag> hashtag) {
        super(evento);
        this.hashtag = hashtag;
    }

    public PeticionHashtags(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }

    public List<Hashtag> getHashtags() {
        return hashtag;
    }

    public void setHashtags(List<Hashtag> hashtag) {
        this.hashtag = hashtag;
    }



}
