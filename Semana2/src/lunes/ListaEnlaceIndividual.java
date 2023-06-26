/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lunes;

/**
 *
 * @author Sistemas G Didactic
 */
public class ListaEnlaceIndividual {

    Nodo cabeza;

    public ListaEnlaceIndividual insertar(ListaEnlaceIndividual lista, int data) {
        Nodo nuevoNodo = new Nodo(data);
        if (lista.cabeza == null) {
            lista.cabeza = nuevoNodo;
        } else {
            Nodo despues = lista.cabeza;
            while (despues.siguiente != null) {
                despues = despues.siguiente;

            }
            despues.siguiente = nuevoNodo;

        }
        return lista;
    }

    public void imprimir(ListaEnlaceIndividual lista) {
        Nodo currNodo = lista.cabeza;
        System.out.println("\nLista Enlazada:");
        while (currNodo != null) {
            System.out.print(currNodo.data + "");
            currNodo = currNodo.siguiente;
        }
        System.out.println("\n");
    }

    public ListaEnlaceIndividual eliminar(ListaEnlaceIndividual lista, int llave) {
        Nodo currNodo = lista.cabeza, previo = null;
        if (currNodo != null && currNodo.data == llave) {
            lista.cabeza = currNodo.siguiente;
            System.out.println(llave + "fue encontrada y eliminada");
            return lista;

        }
        while (currNodo != null && currNodo.data != llave) {
            previo = currNodo;
            currNodo = currNodo.siguiente;
        }
        if (currNodo != null) {
            previo.siguiente = currNodo.siguiente;
            System.out.println(llave + "fue encontrada y eliminada");
        }
        if (currNodo == null) {
            System.out.println(llave + "not found");
        }
        return lista;
    }

}
