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
public class Cliente extends Persona { // Creacion de clase Cliente que hereda de Persona todos sus atributos y no añade ninguno adicional

    Scanner scanner = new Scanner(System.in); 

    public Cliente(String nombre, String apellido, int telefono, String direccion, String correo) {
        super(nombre, apellido, telefono, direccion, correo);
    }

    public void crearCliente() { //Clase dedicada para crear el objeto cliente
        System.out.println("Ingrese el nombre del cliente: ");
        String nom = scanner.nextLine();
        super.setNombre(nom);
        System.out.println("Ingrese el apellido del cliente: ");
        String ape = scanner.nextLine();
        super.setApellido(ape);
        System.out.println("Ingrese el telefono del cliente: ");
        int tel = scanner.nextInt();
        super.setTelefono(tel);
        scanner.nextLine(); /* Esta linea ayuda a solventar el error de que se salta los demas scanner. 
        Limpia cualquier caracter o String en el scanner para continuar con el resto del codigo*/
        System.out.println("Ingrese la dirección del cliente: ");
        String dir = scanner.nextLine();
        super.setDireccion(dir);
        System.out.println("Ingrese el correo electronico del cliente: ");
        String cor = scanner.nextLine();
        super.setCorreo(cor);
    }

    public void imprimir() { //Funcion para imprimir el Cliente creado
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Apellido: " + super.getApellido());
        System.out.println("Teléfono: " + super.getTelefono());
        System.out.println("Dirección: " + super.getDireccion());
        System.out.println("Correo Electrónico: " + super.getCorreo());
    }
}
