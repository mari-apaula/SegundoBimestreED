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
        ListasDoblemteEnlazadas lista = new ListasDoblemteEnlazadas();

        lista.insertarDelante(8);
        lista.insertarDelante(2);
        lista.insertarDelante(11);
        lista.imprimir();

        lista.eliminar(2);

        lista.imprimir();

    }

}
