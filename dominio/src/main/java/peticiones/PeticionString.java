/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public class PeticionString extends Peticion{
    private String str;

    public PeticionString() {
    }

    public PeticionString(String evento, String str) {
        super(evento);
        this.str = str;
    }

    public PeticionString(String evento, int status, String mensajeError) {
        super(evento, status, mensajeError);
    }
    
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
