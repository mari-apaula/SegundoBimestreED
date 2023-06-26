/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDoblementeEnlazadas;

/**
 *
 * @author Sistemas G Didactic
 */
public class Ejecutor {
    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();

        lista = lista.insertar(lista, 4);
        lista = lista.insertar(lista, 3);
        lista = lista.insertar(lista, 9);
        lista = lista.insertar(lista, 2);
        lista = lista.insertar(lista, 12);
        lista = lista.insertar(lista, 5);
        lista = lista.insertar(lista, 8);
        

        lista.imprimir(lista);
        lista = lista.eliminar(lista, 2);
        lista = lista.eliminar(lista, 9);
        lista.imprimir(lista);
    }
}
