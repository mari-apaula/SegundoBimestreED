/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetetres;

/**
 *
 * @author SALA I
 */
public class Persona {
     String tipo;
     int id;
    Persona amistad;

    public Persona(String t, int c) {
        this.tipo = t;
        this.id = c;
    }

    public void concatenar(Persona d) {
        amistad = d;
    }
    
    public String toString(int n, Persona p) {
        String mensaje = "";
       mensaje = String.format("%sPersona\n"
               + "Idenfificación: %d\n"
               + "Tipo: %s\n"
               + "Amigo: %s\n", 
               mensaje, 
               id, 
               tipo, 
               amistad);
        return mensaje;
    }
}
