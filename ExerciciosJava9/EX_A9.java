package ExerciciosJava9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class EX_A9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Set<Integer> numeros = new HashSet<>();
        
        int tamanho;

        System.out.print("Tamanho da array: ");
        tamanho = teclado.nextInt();
        
        System.out.println("Digite o números: ");
        for (int i = 0; i < tamanho; i++) {
        System.out.print("número "+(i+1)+": ");
        numeros.add (teclado.nextInt());
        
        }
        for(int num : numeros){
            System.out.println(num);
}
        if (numeros.contains(5)){
            System.out.println("\nNúmero encontrado.");
}
}
}


