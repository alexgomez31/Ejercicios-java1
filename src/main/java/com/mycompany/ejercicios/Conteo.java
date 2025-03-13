package com.mycompany.ejercicios;

/**
 * Clase para realizar un conteo del 1 al 5.
 */
public class Conteo {
    
    // Método para realizar el conteo manual del 1 al 5
    public void realizarConteo() {
        System.out.println("Iniciando conteo manual...");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contando: " + i);
            
            if (i == 5) {
                System.out.println("¡Lo lograste! Has alcanzado el número 5");
            }
        }
    }
}
