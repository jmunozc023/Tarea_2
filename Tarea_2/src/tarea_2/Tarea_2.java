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
    String nombre = "", apellido = "", direccion = "", correo = "";
    int telefono = 0;
    Cliente cliente = new Cliente(nombre, apellido, telefono, direccion, correo);
    int opcion = 0;
    public String[] meses;
    Meses mes = new Meses();

    public void menuPrincipal() {
        do { //Menu principal
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Mostrar meses");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Constructores de clase Cliente
                    cliente.crearCliente();
                    cliente.imprimir();
                    break;
                case 2:
                    // Lógica para Mostrar los meses
                    mes.ingresarMeses();
                    mes.mostrarMeses();
                    break;
                case 3:
                    // Lógica para Mostrar los meses
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }

    public static void main(String[] args) {
        Tarea_2 tarea2 = new Tarea_2();
        tarea2.menuPrincipal();
    }

}
