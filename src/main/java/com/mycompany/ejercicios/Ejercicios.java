package com.mycompany.ejercicios;
import java.util.Scanner;

/**
 * Clase principal para ejecutar el programa.
 */
public class Ejercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  1) area de un rectángulo
        System.out.println("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Crear instancia de Rectangulo
        Rectangulo rectangulo = new Rectangulo(base, altura);

        // Calcular y mostrar el área
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());

        
        
        // 2) cuadrado de un numero
        
        System.out.println("ingrese un numero para calcular el cuadrado: ");
        int numero = scanner.nextInt();
        
       Numerocuadrado numerocuadrado = new Numerocuadrado(numero);

        System.out.println("El cuadrado del numero es: " + numerocuadrado.calcularCuadrado());

        
        
         //3) Realizar el conteo del 1 al 5
        Conteo conteo = new Conteo();
        conteo.realizarConteo();
        
        //4) Operacion de suma cuando se presiona una tecla
        Evento evento = new Evento();
        evento.sumarConTecla();
        
        
        //5) Calcular la suma de los cuadrados de los números pares
        Poo poo = new Poo();
        poo.calcularSumaCuadradosPares();
        
        // Cerrar el Scanner
        scanner.close();
        
        
        
        
    }
}
