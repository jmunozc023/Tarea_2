/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Meses {
    Scanner scanner = new Scanner(System.in);
    private final String[] meses = new String[12];
    public void ingresarMeses() {
        boolean agregarMes = true;
        int contador = 0;

        while (agregarMes && contador < meses.length) {
            System.out.println("Ingrese un mes: ");
            String mes = scanner.nextLine();
            meses[contador] = mes;
            contador++;

            System.out.println("¿Desea agregar otro mes? (S/N)");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("N")) {
                agregarMes = false;
            }
        }
    }

    public void mostrarMeses() {
        System.out.println("Meses ingresados:");
        for (String mes : meses) {
            if (mes != null) {
                System.out.println(mes);
            }
        }
    }
}
