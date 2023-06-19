/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class Operaciones {

    public Nodo cabeza = null;
    public Nodo cola = null;

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            nuevoNodo.siguiente = cabeza;

        }else{
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza;
        }
    }
    
    public void imprimir() {
        Nodo current = cabeza;
        if (cabeza == null) {
            System.out.println("Lista vacia");
        }else {
            System.out.println("Los nodos de la lista circular son:\n");
            do {                
                System.out.println(" " + current.dato);
                current = current.siguiente;
            } while (current != cabeza); // para para hasta que curret 
                                        // sea diferente de la cabeza
            System.out.println();
        }
    }
    
    
    
    
    
}
