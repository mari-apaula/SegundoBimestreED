/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteUno;

/**
 *
 * @author SALA I
 */
public class HospitalUTPL {
    private Docente primerDocente;
    private Docente ultimoDocente;

    public HospitalUTPL() {
        this.primerDocente = null;
        this.ultimoDocente = null;
    }

    public void asignarTurno(int numeroTicket, int cedula) {
        Docente nuevoDocente = new Docente(numeroTicket, cedula);

        if (primerDocente == null) {
            primerDocente = nuevoDocente;
            ultimoDocente = nuevoDocente;
        } else {
            ultimoDocente.siguiente = nuevoDocente;
            ultimoDocente = nuevoDocente;
        }
    }

    public void atenderDocente() {
        if (primerDocente != null) {
            System.out.println("Atendie5ndo al docente con cédula: " + primerDocente.cedula);
            primerDocente = primerDocente.siguiente;
            if (primerDocente == null) {
                ultimoDocente = null;
            }
        } else {
            System.out.println("No hay docentes en espera.");
        }
    }

    public void eliminarDocente(int ticket) {
        if (primerDocente != null && primerDocente.numeroTicket == ticket) {
            primerDocente = primerDocente.siguiente;
            if (primerDocente == null) {
                ultimoDocente = null;
            }
            return;
        }

        Docente actual = primerDocente;
        Docente anterior = null;

        while (actual != null && actual.numeroTicket != ticket) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("No se encontró al docente con ticket: " + ticket);
            return;
        }

        anterior.siguiente = actual.siguiente;
        if (actual == ultimoDocente) {
            ultimoDocente = anterior;
        }
    }

    public void mostrarDocentes() {
        Docente actual = primerDocente;

        if (actual == null) {
            System.out.println("No hay docentes en espera.");
            return;
        }

        System.out.println("Lista de docentes en espera:");
        while (actual != null) {
            System.out.println("Cédula: " + actual.cedula);
            actual = actual.siguiente;
        }
    }
}

