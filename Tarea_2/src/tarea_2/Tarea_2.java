/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_2;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Tarea_2 {
    Scanner scanner = new Scanner(System.in);
    int opcion= 0;
    public void menuPrincipal(){
        do {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Mostrar meses");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para crear un dependiente
                    
                   
                    break;
                case 2:
                    // Lógica para crear un ingeniero
                    
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
