/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author SALA I
 */
public class Nodo {
    int dato;
    Nodo siguiente;
    
    public Nodo() {
        dato = 0;
        siguiente = null;
    }
    
    public Nodo(int a) {
        dato = a;
        siguiente = null;
    }
    
    public void concatenandoSiguiente(Nodo nod) {
        siguiente = nod;
    }
}
