/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author jegav
 */
public class FacebootException extends Exception {

    public FacebootException(String message) {
        super(message);
    }

    public FacebootException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
