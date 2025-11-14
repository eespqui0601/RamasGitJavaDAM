package edu.eespqui0601.ssh;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Investiga el uso de random y genera por pantalla los números de la lotería primitiva.
        Random random = new Random();
        int numbers;
        int complement;
        
        System.out.println("Números de la Lotería Primitiva:");
        // Genera 5 números principales
        for (int i = 0; i < 5; i++) {
        	numbers = random.nextInt();
        	System.out.println(numbers);
        }
        
        // Número complementario
        complement = random.nextInt();
        System.out.printf("Número complementario: \n %d", complement);
    }
}