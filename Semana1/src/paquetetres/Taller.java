/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetetres;

import java.util.Scanner;



/**
 *
 * @author SALA I
 */
public class Taller {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         String tipoP ;
        
        System.out.println("¿Cuantas personas desea ingresar?"); 
        int op = entrada.nextInt();
        entrada.nextLine();
        
        Persona[] obj = new Persona[op];
        
        for (int i = 0; i < op; i++) {
            System.out.println("Ingrese su numero de cedula");
            int id = entrada.nextInt();
            System.out.println("Ingrese un numero:\n"
                 + "1. Administrativo\n"
                 + "2. Docente\n"
                 + "3. Estudiente\n"
                 + "Culquier otro numero sera estudiante ");
            int tipo = entrada.nextInt();
            
            switch (tipo) {
                case 1:
                    tipoP = "Administrativo";
                    break;
                case 2:
                    tipoP = "Docente";

                    break;
                case 3:
                    tipoP = "Estudiente";
                    break;
                default:
                    tipoP = "Estudiente";
            }
            
            
            obj[i] = new Persona(tipoP, id);
            
        }
        
        
        for (int i = 0; i < obj.length-1; i++) {
            obj[i].concatenar(obj[i+1]);
        }
        
        System.out.println("\n\tMemorias");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        System.out.println("\n\tResumen");
        String rep = "";
        for (int i = 0; i < obj.length; i++) {
            rep = rep + obj[i].toString(i, obj[i]);

        }
        System.out.println(rep);
    }
}
