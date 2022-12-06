/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

import entidades.Hashtag;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public class PeticionHashtag extends Peticion {
    private Hashtag hashtag;

    public PeticionHashtag() {
    }

    public PeticionHashtag(String evento, Hashtag hashtag) {
        super(evento);
        this.hashtag = hashtag;
    }

    public PeticionHashtag(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }
    
    public PeticionHashtag(String evento, int status, Hashtag hashtag) {
        super(evento, status);
        this.hashtag = hashtag;
    }

    public Hashtag getHashtag() {
        return hashtag;
    }

    public void setHashtag(Hashtag hashtag) {
        this.hashtag = hashtag;
    }
}
