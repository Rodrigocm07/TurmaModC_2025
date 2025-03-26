package ExerciciosJava2;

import java.util.Scanner;


public class EX_B2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um ano e verfique se ele é bissexto: ");
        int ano = teclado.nextInt();
        
        boolean bissexto;
        bissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
        
        System.out.println("O ano é bisexto? "+bissexto);
    }
    
}
