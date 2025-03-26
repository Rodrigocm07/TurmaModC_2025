package ExerciciosJava2;

import java.util.Scanner;

public class EX_I2 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
        System.out.print("Verifique se o numero está fora de 100 e 200: ");
        int numero = teclado.nextInt();
        
       boolean intervalo = ((numero < 100) || (numero > 200));
        
        System.out.println("O numero "+numero+ " está fora entre 100 e 200? "+ intervalo);
    }
    
}
