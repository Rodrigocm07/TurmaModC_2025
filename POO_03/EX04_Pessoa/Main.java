package EX04_Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        System.out.print("Quantas pessoas deseja cadastrar?");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nome da pessoa " + (i+1) + ":");
            String nome = sc.nextLine();
            
            System.out.print("Idade da pessoa " + (i+1) + ":");
            int idade = sc.nextInt();
            sc.nextLine();
            
            pessoas.add(new Pessoa(nome, idade));
        }
        
        Collections.sort(pessoas);
        System.out.println("Pessoas ordenadas por idade:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
    }
}
