/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteUno;

/**
 *
 * @author SALA I
 */
public class Docente {
        public int numeroTicket;
        public int cedula;
        public Docente siguiente;

        public Docente(int t, int cd) {
            numeroTicket = t;
            cedula = cd;
            siguiente = null;
        }
    }


