/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteUno;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) {
        HospitalUTPL hospital = new HospitalUTPL();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Asignar turno a un docente");
            System.out.println("2. Atender a un docente");
            System.out.println("3. Eliminar docente de la lista");
            System.out.println("4. Mostrar docentes en espera");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de ticket: ");
                    int numeroTicket = scanner.nextInt();
                    System.out.print("Ingrese el número de cédula del docente: ");
                    int cedula = scanner.nextInt();
                    hospital.asignarTurno(numeroTicket, cedula);
                    break;
                case 2:
                    hospital.atenderDocente();
                    break;
                case 3:
                    System.out.print("Ingrese el número de ticket del docente a eliminar: ");
                    int cedulaEliminar = scanner.nextInt();
                    hospital.eliminarDocente(cedulaEliminar);
                    break;
                case 4:
                    hospital.mostrarDocentes();
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
        scanner.close();
    }
}

