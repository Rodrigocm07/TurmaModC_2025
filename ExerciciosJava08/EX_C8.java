package ExerciciosJava8;

import java.util.Scanner;


public class EX_C8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int comparador = 0;
        int tamanho;
        
        System.out.println("Quantos numeros deseja comparar? ");
        tamanho = teclado.nextInt();
        
        int[] numeros = new int [tamanho];
        
        System.out.println("Digite o números: ");
        for (int i = 0; i < tamanho; i++) {
        System.out.print("número "+(i+1)+": ");
        numeros[i] = teclado.nextInt();
        }
        for (int numero : numeros)
        if (numero > comparador){
            comparador = numero;
        }
            System.out.println("O numero maior é: "+comparador);
    }
}

