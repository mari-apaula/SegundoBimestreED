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
    Nodo next;
    
    public Nodo() {
        dato = 0;
        next = null;
    }
    
    public Nodo(int a) {
        dato = a;
        next = null;
    }
    
    public void concatenandoNext(Nodo nod) {
        next = nod;
    }
}
