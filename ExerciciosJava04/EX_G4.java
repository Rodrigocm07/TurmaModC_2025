package ExerciciosJava4;

import java.util.Scanner;

public class EX_G4 {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite o primeiro numero: ");
            int numero1 = teclado.nextInt();
            
            System.out.print("Digite o numero final: ");
            int numero2 = teclado.nextInt();
            
            System.out.print("Digite o incremento: ");
            int incremento = teclado.nextInt();
            
            for (int i = numero1; i <= numero2; i += incremento) {
                System.out.println(i);
            }
        }
    }
}
