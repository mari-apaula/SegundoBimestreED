/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularSimplementeEnlazada;

/**
 *
 * @author Sistemas G Didactic
 */
public class ListaCircularEnlazada {

    class Nodo {

        int dato;
        Nodo siguiente;

        public Nodo(int d) {
            dato = d;
            siguiente = null;
        }
    }

    Nodo cabeza;

    public ListaCircularEnlazada insertar(ListaCircularEnlazada lista, int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (lista.cabeza == null) {
            lista.cabeza = nuevoNodo;
            nuevoNodo.siguiente = nuevoNodo; 
        } else {
            Nodo ultimo = lista.cabeza;
            while (ultimo.siguiente != lista.cabeza) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = lista.cabeza; 
        }
        return lista;
    }

    public void mostrar(ListaCircularEnlazada lista) {
        if (lista.cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = lista.cabeza;
        System.out.print("Lista Circular: ");
        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != lista.cabeza);
        System.out.println();
    }

    public ListaCircularEnlazada eliminar(ListaCircularEnlazada lista, int clave) {
        if (lista.cabeza == null) {
            System.out.println("La lista está vacía. No se puede eliminar ningún nodo.");
            return lista;
        }

        Nodo actual = lista.cabeza;
        Nodo previo = null;

        do {
            if (actual.dato == clave) {
                if (previo != null) {
                    previo.siguiente = actual.siguiente;
                    if (actual == lista.cabeza) {
                        lista.cabeza = actual.siguiente;
                    }
                } else {

                    if (actual.siguiente == lista.cabeza) {
                        lista.cabeza = null;
                    } else {
                        Nodo ultimo = lista.cabeza;
                        while (ultimo.siguiente != lista.cabeza) {
                            ultimo = ultimo.siguiente;
                        }
                        lista.cabeza = actual.siguiente;
                        ultimo.siguiente = lista.cabeza;
                    }
                }
                System.out.println(clave + " encontrado y eliminado.");
                return lista;
            }
            previo = actual;
            actual = actual.siguiente;
        } while (actual != lista.cabeza);

        System.out.println(clave + " no encontrado en la lista.");
        return lista;
    }

}
