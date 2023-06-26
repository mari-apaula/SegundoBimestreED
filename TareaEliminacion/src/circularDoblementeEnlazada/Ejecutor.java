/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularDoblementeEnlazada;

/**
 *
 * @author Sistemas G Didactic
 */
public class Ejecutor {
    public static void main(String[] args) {
        ListaCircularDoblementeEnlazada lista = new ListaCircularDoblementeEnlazada();

        // Insertar elementos
        lista = lista.insertar(lista, 1);
        lista = lista.insertar(lista, 4);
        lista = lista.insertar(lista, 14);
        lista = lista.insertar(lista, 5);
        lista = lista.insertar(lista, 8);
        lista = lista.insertar(lista, 2);
        lista = lista.insertar(lista, 12);
        lista = lista.insertar(lista, 5);
        lista = lista.insertar(lista, 3);

        // Mostrar la lista
        lista.mostrar(lista);

        // Eliminar un nodo dado un valor
        lista = lista.eliminar(lista, 5);

        // Mostrar la lista después de eliminar el nodo
        lista.mostrar(lista);
    }
}

