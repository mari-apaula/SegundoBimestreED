/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquteuno;

/**
 *
 * @author SALA I
 */
public class Persona {
    String nombre;
    int edad;
    
    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }
    
    public void cambiarDatos(String n, int e) {
        nombre = n;
        edad = e;
         
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
    }
}
