package ExerciciosJava9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class EX_D9 {

    public static void main(String[] args) {
        
    Set<String> cidades = new HashSet<>();
    Scanner teclado = new Scanner(System.in);
    
    int tamanho;

        System.out.print("Tamanho da array: ");
        tamanho = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Digite as cidades ");
        for (int i = 0; i < tamanho; i++) {
        System.out.print("cidade "+(i+1)+": ");
        cidades.add(teclado.nextLine());
        
        }
             System.out.println("\n== Lista de cidades ==");
        for(String cidade : cidades){
            System.out.println(cidade);
}
        boolean city = cidades.isEmpty();
        System.out.println("\n -> Está vazia? "+city);
    
    }
}
