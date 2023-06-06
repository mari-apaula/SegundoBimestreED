/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquteuno;

/**
 *
 * @author Croks
 */
public class EstructurasDinamicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona personaA;
        Persona personaB;
        Persona personaC;

        
        personaA = new Persona("Ana", 22);
        personaB = new Persona("Juan", 25);
        personaC = new Persona("Kevin", 22);

        System.out.println("personaA: " + personaA + "\n");
        System.out.println("personaB: " + personaB + "\n");
        System.out.println("personaC: " + personaC + "\n");
        
        personaC = personaA;
        System.out.println("personaC: " + personaC + "\n");

        personaA.cambiarDatos("Doris",33);
        personaA.mostrarDatos();


    }
    
}
