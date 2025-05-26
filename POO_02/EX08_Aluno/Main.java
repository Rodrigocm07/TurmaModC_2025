package EX08_Aluno;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        double[] notas = new double[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        Aluno aluno = new Aluno(nome, matricula, notas);

        int opcao;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Ver status");
            System.out.println("2 - Atualizar notas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> aluno.status();
                case 2 -> {
                    double[] novasNotas = new double[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Nota " + (i + 1) + ": ");
                        novasNotas[i] = sc.nextDouble();
                    }
                    aluno.setNotas(novasNotas);
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
    }
}
