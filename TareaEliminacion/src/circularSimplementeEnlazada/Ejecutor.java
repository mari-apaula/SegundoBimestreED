/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularSimplementeEnlazada;

/**
 *
 * @author Sistemas G Didactic
 */
public class Ejecutor {

    public static void main(String[] args) {

        ListaCircularEnlazada lista = new ListaCircularEnlazada();

        lista = lista.insertar(lista, 1);
        lista = lista.insertar(lista, 4);
        lista = lista.insertar(lista, 3);
        lista = lista.insertar(lista, 9);
        lista = lista.insertar(lista, 6);
        lista = lista.insertar(lista, 2);
        lista = lista.insertar(lista, 12);
        lista = lista.insertar(lista, 5);
        lista = lista.insertar(lista, 8);

        lista.mostrar(lista);

        lista = lista.eliminar(lista, 6);

        lista.mostrar(lista);
    }
}
