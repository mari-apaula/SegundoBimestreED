/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author SALA I
 */
public class ListasDoblemteEnlazadas {
        // Nodo para lista doblemente enlazada 
        class Node{
            int dato;
            Node previo;
            Node next;
            
            public Node(int dato){
                this.dato = dato;
            }
        }
        Node cabeza= null;
        Node cola = null;
    
    public  void insertar(int dato) {
        Node nuevoNodo = new Node(dato);
        
        // si la lista est[a vacia 
        if (cabeza == null) {
            cabeza = cola = nuevoNodo;
            cabeza.previo = null;
            cola.next= null;
        } else {
            cola.next = nuevoNodo;
            nuevoNodo.previo = cola;
            cola = nuevoNodo;
            cola.next = null;
        }
    }
    
    public  void insertarDelante(int dato) {
        Node nuevoNodo = new Node(dato);
        
        // si la lista est[a vacia 
        if (cola == null) {
            cola = cabeza = nuevoNodo;
            cola.previo = null;
            cabeza.next= null;
        } else {
            cabeza.previo = nuevoNodo;
            nuevoNodo.next = cabeza;
            cabeza = nuevoNodo;
            cabeza.previo = null;
        }
    }
    
        public void imprimir() {
            // curret apunta ala cabeza 
            Node current = cabeza;
            if (cabeza == null) {
                System.out.println("Lista vacia");
                return;
            }
            System.out.println("Nodos de doble enlace");
            while (current != null ) {                
                System.out.println(current.dato + "");
                current = current.next;
            }
        }
        
        public void imprimirAtras() {
            // curret apunta ala cabeza 
            Node current = cola;
            if (cola == null) {
                System.out.println("Lista vacia");
                return;
            }
            System.out.println("Nodos de doble enlace");
            while (current != null ) {                
                System.out.println(current.dato + "");
                current = current.previo;
            }
        }
        
    }

