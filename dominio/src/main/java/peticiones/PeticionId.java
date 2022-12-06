/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;


/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public class PeticionId extends Peticion {
    
    private Integer id;
    
    public PeticionId() {
    }

    public PeticionId(String evento, Integer id) {
        super(evento);
        this.id = id;
    }

    public PeticionId(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }
    
    public PeticionId(Integer id, String evento, int status) {
        super(evento, status);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
