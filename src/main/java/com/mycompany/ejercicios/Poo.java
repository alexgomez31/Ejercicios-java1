/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;
import java.util.Scanner;


public class Poo {
    
    // Método para calcular la suma de los cuadrados de los números pares
    public void calcularSumaCuadradosPares() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros para hacer la operación: ");
        int cantidad = scanner.nextInt();

        int sumaCuadrados = 0;

        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            // Verificar si el número es par
            if (numero % 2 == 0) {
                sumaCuadrados += (numero * numero);
            }
        }

        System.out.println("La suma de los cuadrados de los números pares es: " + sumaCuadrados);
    }
}
