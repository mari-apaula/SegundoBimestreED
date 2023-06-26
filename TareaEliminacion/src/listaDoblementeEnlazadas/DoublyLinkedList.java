/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDoblementeEnlazadas;

/**
 *
 * @author Sistemas G Didactic
 */
public class DoublyLinkedList {

    class Nodo {

        int dato;
        Nodo anterior;
        Nodo siguiente;

        public Nodo(int d) {
            dato = d;
            anterior = null;
            siguiente = null;
        }
    }

    Nodo cabeza;

    public DoublyLinkedList insertar(DoublyLinkedList lista, int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (lista.cabeza == null) {
            lista.cabeza = nuevoNodo;
        } else {
            Nodo ultimo = lista.cabeza;
            while (ultimo.siguiente != null) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.anterior = ultimo;
        }
        return lista;
    }

    public void imprimir(DoublyLinkedList lista) {
        Nodo actual = lista.cabeza;
        System.out.println("Lista Doblemente Enlazada (hacia adelante):");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public DoublyLinkedList eliminar(DoublyLinkedList lista, int clave) {
        Nodo actual = lista.cabeza;

        while (actual != null) {
            if (actual.dato == clave) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    lista.cabeza = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                }
                System.out.println(clave + " encontrado y eliminado");
                return lista;
            }
            actual = actual.siguiente;
        }

        System.out.println(clave + " no encontrado");
        return lista;
    }

}

