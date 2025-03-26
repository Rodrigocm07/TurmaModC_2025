package ExerciciosJava9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class EX_E9 {

    public static void main(String[] args) {
        
    Set<String> Cores = new HashSet<>();
    Scanner teclado = new Scanner(System.in);
    
    int tamanho;

        System.out.print("Tamanho da array: ");
        tamanho = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Digite as cores ");
        for (int i = 0; i < tamanho; i++) {
        System.out.print("Cor "+(i+1)+": ");
        Cores.add(teclado.nextLine());
        
        }
             System.out.println("\n== Lista de cores ==");
        for(String cor : Cores){
            System.out.println(cor);
}
        ArrayList<String> Colors = new ArrayList<>(Cores);
        System.out.println("\n == Lista Array ==");
        for(String Color : Colors){
            System.out.println(Color);
        }
}
}