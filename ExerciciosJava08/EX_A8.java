package ExerciciosJava8;

import java.util.Scanner;


public class EX_A8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int tamanho;

        System.out.println("Quantos numeros deseja comparar? ");
        tamanho = teclado.nextInt();
        
        int[] numeros = new int [tamanho];
        
        System.out.println("Digite o números: ");
        for (int i = 0; i < tamanho; i++) {
        System.out.print("número "+(i+1)+": ");
        numeros[i] = teclado.nextInt();
        }
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
            System.out.println("soma: "+soma);
    }
}
