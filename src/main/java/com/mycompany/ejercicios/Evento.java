/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;
import java.util.Scanner;

/**
 * Clase que realiza una suma cuando se presiona la tecla ESPACIO.
 */
public class Evento {

    public void sumarConTecla() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos números al usuario
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Presione la tecla ESPACIO y luego ENTER para realizar la suma...");

        scanner.nextLine(); 
        String tecla = scanner.nextLine();

        if (tecla.equals(" ")) {
            int suma = num1 + num2;
            System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
        } else {
            System.out.println("No presionaste la tecla ESPACIO.");
        }
    }
}

