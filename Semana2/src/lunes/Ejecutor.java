/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lunes;

/**
 *
 * @author Sistemas G Didactic
 */
public class Ejecutor {
    
    
    public static void main(String[] args) {
        ListaEnlaceIndividual lista = new ListaEnlaceIndividual();
    
    lista = lista.insertar(lista, 3);
    lista = lista.insertar(lista, 8);
    lista = lista.insertar(lista, 1);
    lista.imprimir(lista);
    lista = lista.eliminar(lista, 1);
    lista.imprimir(lista);

    }

    
        
}
