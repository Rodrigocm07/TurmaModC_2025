package ExerciciosJava4;

import java.util.Scanner;

public class EX_I4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite o número 1: ");
            int num = teclado.nextInt();
            int maior = num;
            int menor = num;
            
            for (int i = 2; i <= 7; i++) {
                System.out.print("Digite o número " + i + ": ");
                num = teclado.nextInt();
                
                if (num > maior) {
                    maior = num;
                }
                
                if (num < menor) {
                    menor = num;
                }
            }
            
            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);
        }
    }
}
