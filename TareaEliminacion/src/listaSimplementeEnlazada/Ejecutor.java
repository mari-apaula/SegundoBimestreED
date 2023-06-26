/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaSimplementeEnlazada;

/**
 *
 * @author Sistemas G Didactic
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinglyLinkedList lista = new SinglyLinkedList();

        lista = lista.insertar(lista, 1);
        lista = lista.insertar(lista, 2);
        lista = lista.insertar(lista, 12);
        lista = lista.insertar(lista, 5);
        lista = lista.insertar(lista, 4);
        lista = lista.insertar(lista, 3);
        lista = lista.insertar(lista, 9);
        lista = lista.insertar(lista, 8);
        lista = lista.insertar(lista, 7);
        lista.imprimir(lista);

        lista = lista.eliminar(lista, 8);

        lista.imprimir(lista);
    }

}
