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
    

    public Nodo addRecursividad(Nodo current, int dato) {
        if (current == null) { // comprueba si la raiz es nula
            return new Nodo(dato);
        }
        
        // asiganamos a la parte izquierda
        if (dato < current.dato) { // comprueba si el dato es menor a la raiz
            current.izquierda = addRecursividad(current.izquierda, dato);
            
        }else if(dato > current.dato){ // 
            current.derecho = addRecursividad(current.derecho, dato);
        }else{
                // el dato existe
                return current;
                }
        
        // devuelce una nueva raiz o pone una nueva raiz
        return current; // para devolver la raiz
        
    }
    
    public void add(int dato) {
        raiz = addRecursividad(raiz, dato);
    }
}
