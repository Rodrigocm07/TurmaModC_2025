package EX02_Animais;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animais> animais = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n==== Menu ====");
            System.out.println("1 - Mamíferos");
            System.out.println("2 - Aves");
            System.out.println("3 - Répteis");
            System.out.println("4 - Exibir todos os animais");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha

            switch (op) {
                case 1 -> {
                    System.out.print("Espécie de mamífero: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade do mamífero: ");
                    int idade = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Tipo de pelagem: ");
                    String tipoPelo = sc.nextLine();
                    animais.add(new Mamiferos(nome, idade, tipoPelo));
                    System.out.println("Mamífero registrado com sucesso!");
                }
                case 2 -> {
                    System.out.print("Espécie de ave: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade da ave: ");
                    int idade = sc.nextInt();
                    sc.nextLine(); // Consome a quebra de linha
                    System.out.print("Digite a envergadura: ");
                    String envergadura = sc.nextLine();
                    animais.add(new Aves(nome, idade, envergadura));
                    System.out.println("Ave registrada com sucesso!");
                }
                case 3 -> {
                    System.out.print("Espécie de réptil: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade do réptil: ");
                    int idade = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Tipo de escama: ");
                    String tipoEscama = sc.nextLine();
                    animais.add(new Repteis(nome, idade, tipoEscama));
                    System.out.println("Réptil registrado com sucesso!");
                }
                case 4 -> {
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        System.out.println("\n=== ANIMAIS CADASTRADOS ===");
                        for (Animais a : animais) {
                            System.out.println("--------------");
                            a.exibirInfo();
                        }
                    }
                }
                case 0 -> System.out.println("Encerrando programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
}

