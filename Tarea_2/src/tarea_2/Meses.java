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
public class Meses { // Clase para crear el array y la logica para solicitar los meses

    Scanner scanner = new Scanner(System.in);
    private final String[] meses = new String[12]; //Declaracion del Array meses con un maximo de 12 campos

    public void ingresarMeses() {
        /* Este metodo utiliza un booleano para determinar si ingresa o no el nombre del mes en el array
        Adicional tiene un contador para saber cuando llega al final de los campos del array*/
        boolean agregarMes = true;
        int cont = 0;
        while (agregarMes && cont < meses.length) {
            /*Este ciclo toma los valores de agregarMes y cont para recorrer el array, 
            solamente si ambos son true continua el proceso */
            System.out.println("Ingrese el mes que desea almacenar: ");
            String mes = scanner.nextLine();
            meses[cont] = mes;
            cont++;
            System.out.println("¿Desea agregar otro mes? (S/N)");
            String continuar = scanner.nextLine();
            if (continuar.equalsIgnoreCase("N")) {
                agregarMes = false;
            }
        }
    }

    public void mostrarMeses() { //Este metodo recorre el array para imprimir los valores en pantalla
        System.out.print("Meses ingresados:");
        for (String mes : meses) {
            if (mes != null) {
                System.out.println(mes);
            }
        }

    }
}
