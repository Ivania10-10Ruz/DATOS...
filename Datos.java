/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datos;
import java.util.Scanner;
/**
 *
 * @author Graciela
 */
public class Datos {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo multidimensional para almacenar datos de 5 compañeros
        // Cada compañero tendrá: nombre, apellido, carrera, lugar de trabajo
        String[][] compañeros = new String[5][4];

        // Solicitar al usuario que ingrese los datos uno por uno
        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Introduce los datos del compañero " + (i + 1) + ":");

            System.out.print("Nombre: ");
            compañeros[i][0] = scanner.nextLine();  // Guardar el nombre

            System.out.print("Apellido: ");
            compañeros[i][1] = scanner.nextLine();  // Guardar el apellido

            System.out.print("Carrera: ");
            compañeros[i][2] = scanner.nextLine();  // Guardar la carrera

            System.out.print("Lugar de trabajo: ");
            compañeros[i][3] = scanner.nextLine();  // Guardar el lugar de trabajo

            System.out.println();  // Separar cada entrada con una línea en blanco
        }

        // Imprimir los datos almacenados en el arreglo
        System.out.println("Datos de tus compañeros de clase:\n");
        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Compañero " + (i + 1) + ":");
            System.out.println("Nombre: " + compañeros[i][0]);
            System.out.println("Apellido: " + compañeros[i][1]);
            System.out.println("Carrera: " + compañeros[i][2]);
            System.out.println("Lugar de trabajo: " + compañeros[i][3]);
            System.out.println();  // Separar cada compañero con una línea en blanco
        }
    }
}
