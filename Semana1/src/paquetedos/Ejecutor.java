/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        Nodo objA = new Nodo(8);
        System.out.println(objA);

        // Nodo abjB = new Nodo();
        Nodo objB = new Nodo(4);
        System.out.println(objB);

        objA.concatenandoSiguiente(objB);
        System.out.println("Next A: " + objA.siguiente);

        Nodo objC = new Nodo(11);
        System.out.println(objC);
        objB.concatenandoSiguiente(objC);
        System.out.println("Next B: " + objB.siguiente);
        System.out.println("Next C: " + objC.siguiente);

    }
}
