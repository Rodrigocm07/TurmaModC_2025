package ExerciciosJava5_1;

import java.util.Random;
import java.util.Scanner;

public class EX_E5_1 {
    public static void main(String[] args) {
        
        Random rm = new Random();
        try (Scanner teclado = new Scanner(System.in)) {
            int numero = rm.nextInt(100); 
            int tentativa = 1;
            int palpite;
            System.out.print("Tente adivinhar o número entre 1 e 100: ");
            do {
                palpite = teclado.nextInt(); 
                
                if (numero == palpite) {
                    System.out.println("Parabéns! Você acertou na " + tentativa + "ª tentativa.");
                } else if (palpite < numero) {
                    System.out.println("O número é maior. Tente novamente:");
                } else {
                    System.out.println("O número é menor. Tente novamente:");
                }
                
                tentativa++;
            } while (tentativa <= 7);
            if (palpite != numero) {
                System.out.println("\nVocê não conseguiu adivinhar o número. O número era " + numero);
            }

        } 
    }
}


