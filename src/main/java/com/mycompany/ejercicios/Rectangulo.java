package com.mycompany.ejercicios;

/**
 * Clase para representar un rectángulo y calcular su área.
 */
public class Rectangulo {
    private double base;
    private double altura;

    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return base * altura;
    }
    
    
}
