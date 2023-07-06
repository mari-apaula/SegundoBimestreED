/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArbolBinarioBusqueda bt = new ArbolBinarioBusqueda();

        bt.abb(6);
        bt.abb(4);
        bt.abb(8);
        bt.abb(3);
        bt.abb(5);
        bt.abb(9);
        bt.abb(7);

        bt.preOrden(bt.raiz);
        System.out.println("");
        

        
        bt.preOrden((bt.raiz));
        System.out.println("");
        bt.eliminar(8);
        System.out.println("");
        bt.preOrden(bt.raiz);
        bt.eliminar(6);
        System.out.println("");
        bt.preOrden(bt.raiz);

    }

}
