/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularDoblementeEnlazada;

/**
 *
 * @author Sistemas G Didactic
 */
public class ListaCircularDoblementeEnlazada {

    class Nodo {
        int dato;
        Nodo previo;
        Nodo siguiente;

        public Nodo(int d) {
            dato = d;
            previo = null;
            siguiente = null;
        }
    }

    Nodo cabeza;

    public ListaCircularDoblementeEnlazada insertar(ListaCircularDoblementeEnlazada lista, int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (lista.cabeza == null) {
            lista.cabeza = nuevoNodo;
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.previo = nuevoNodo;
        } else {
            Nodo ultimo = lista.cabeza.previo;
            nuevoNodo.siguiente = lista.cabeza;
            nuevoNodo.previo = ultimo;
            lista.cabeza.previo = nuevoNodo;
            ultimo.siguiente = nuevoNodo;
        }
        return lista;
    }

    public void mostrar(ListaCircularDoblementeEnlazada lista) {
        if (lista.cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = lista.cabeza;
        System.out.print("Lista Circular (hacia adelante): ");
        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != lista.cabeza);
        System.out.println();

        actual = lista.cabeza.previo;
        System.out.print("Lista Circular (hacia atrás): ");
        do {
            System.out.print(actual.dato + " ");
            actual = actual.previo;
        } while (actual != lista.cabeza.previo);
        System.out.println();
    }

    public ListaCircularDoblementeEnlazada eliminar(ListaCircularDoblementeEnlazada lista, int clave) {
        if (lista.cabeza == null) {
            System.out.println("La lista está vacía. No se puede eliminar ningún nodo.");
            return lista;
        }

        Nodo actual = lista.cabeza;

        do {
            if (actual.dato == clave) {
                Nodo previo = actual.previo;
                Nodo siguiente = actual.siguiente;

                previo.siguiente = siguiente;
                siguiente.previo = previo;

                if (actual == lista.cabeza) {
                    lista.cabeza = siguiente; // Actualizar la cabeza si el nodo eliminado es la cabeza
                }

                System.out.println(clave + " encontrado y eliminado.");
                return lista;
            }
            actual = actual.siguiente;
        } while (actual != lista.cabeza);

        System.out.println(clave + " no encontrado en la lista.");
        return lista;
    }

}




