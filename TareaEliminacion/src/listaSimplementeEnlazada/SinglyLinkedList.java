/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaSimplementeEnlazada;

/**
 *
 * @author Sistemas G Didactic
 */
public class SinglyLinkedList {

    class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int d) {
            dato = d;
            siguiente = null;
        }
    }

    Nodo cabeza;

    public SinglyLinkedList insertar(SinglyLinkedList lista, int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (lista.cabeza == null) {
            lista.cabeza = nuevoNodo;
        } else {
            Nodo ultimo = lista.cabeza;
            while (ultimo.siguiente != null) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
        }
        return lista;
    }

    public void imprimir(SinglyLinkedList lista) {
        Nodo nodoActual = lista.cabeza;
        System.out.println("Lista Enlazada:");
        while (nodoActual != null) {
            System.out.print(nodoActual.dato + " ");
            nodoActual = nodoActual.siguiente;
        }
        System.out.println();
    }

    public SinglyLinkedList eliminar(SinglyLinkedList lista, int clave) {
        Nodo nodoActual = lista.cabeza;
        Nodo previo = null;

        if (nodoActual != null && nodoActual.dato == clave) {
            lista.cabeza = nodoActual.siguiente;
            System.out.println(clave + " encontrado y eliminado");
            return lista;
        }

        while (nodoActual != null && nodoActual.dato != clave) {
            previo = nodoActual;
            nodoActual = nodoActual.siguiente;
        }

        if (nodoActual != null) {
            previo.siguiente = nodoActual.siguiente;
            System.out.println(clave + " encontrado y eliminado");
        }

        if (nodoActual == null) {
            System.out.println(clave + " no encontrado");
        }

        return lista;
    }
}


