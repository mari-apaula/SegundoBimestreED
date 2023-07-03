/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class ArbolBinarioBusqueda {

    Nodo raiz;
    
    public Nodo abbRecursividad(Nodo current, int dato) {
        if (current == null) { // comprueba si la raiz es nula
            return new Nodo(dato);
        }
        
        // asiganamos a la parte izquierda
        if (dato < current.dato) { // comprueba si el dato es menor a la raiz
            current.izquierda = abbRecursividad(current.izquierda, dato);
            
        }else if(dato > current.dato){ // 
            current.derecho = abbRecursividad(current.derecho, dato);
        }else{
                // el dato existe
                return current;
                }
        
        // devuelce una nueva raiz o pone una nueva raiz
        return current; // para devolver la raiz
        
    }
    
    public void abb(int dato) {
        raiz = abbRecursividad(raiz, dato);
    }
    
    private Nodo eliminarRecursividad(Nodo current, int dato){
        if (current == null) {
            return null;
        }
        
        if (dato == current.dato) {
            // pregunta si el dato es igual al current
            if (current.izquierda == null && current.derecho == null) {
                return null;
            }
            // 
            if (current.derecho == null) {
                return current.izquierda;
            }
            int datoPequenio = encontrarDatoPequenio(current.derecho);
            current.dato = datoPequenio;
            current.derecho = eliminarRecursividad(current.derecho, datoPequenio);
            current.derecho = eliminarRecursividad(current.derecho, datoPequenio);
            return current;
        }
        
        if (dato < current.dato) {
            current.izquierda = eliminarRecursividad(current.izquierda, dato);
            return current;
        }
        current.izquierda = eliminarRecursividad(current.derecho, dato);
        
        return current;
    }
    
    private int encontrarDatoPequenio(Nodo raiz){
        return raiz.derecho == null? raiz.dato: encontrarDatoPequenio(raiz.izquierda);
    }
    
    public void eliminar( int dato){
        raiz = eliminarRecursividad(raiz, dato);
    }
        
}

