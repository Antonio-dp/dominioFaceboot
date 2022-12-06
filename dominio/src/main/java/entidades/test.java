/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidades;

import enumeradores.MotorEnvio;
import enumeradores.Sexo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.Calendar;

/**
 *
 * @author Jesus Valencia, Antonio del Pardo, Marco Irineo, Giovanni Garrido
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar fecha = Calendar.getInstance();
        Usuario remitente = new Usuario("Remitente", "1", "tony@mail.com", "6441573449", Sexo.MASCULINO, fecha);
        Usuario destino = new Usuario("Destino", "1", "tonydpe@mail.com", "6441573449", Sexo.MASCULINO, fecha);
        //Usuario usuario = new Usuario("tony", "ea");
        Notificacion n = new Notificacion(remitente, destino, fecha, MotorEnvio.TwilioSMS, "Abr si mapea");
        EntityManager em;
        //Obtiene acceso alemFactory a partir de la persistence unit utilizada
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("facebootPU");
        // Creamos una em(bd) para realizar operaciones con la bd
        em = emFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(n);
        em.getTransaction().commit();
        //Publicacion p = em.find(Publicacion.class, )
        em.close();
    }

}
