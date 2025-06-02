package EX10_Pessoas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Escolha: \n1 - Professor \n2 - Aluno \n3 - Funcionário");

            int op;
            while (true) {
                if (sc.hasNextInt()) {
                    op = sc.nextInt();
                    if (op >= 1 && op <= 3) {
                        break;
                    }
                } else {
                    sc.next(); 
                }
                System.out.println("Opção inválida. \nEscolha: \n1 - Professor \n2 - Aluno \n3 - Funcionário");
            }

            Pessoa p = switch (op) {
                case 1 ->
                    new Professor(nome);
                case 2 ->
                    new Aluno(nome);
                case 3 ->
                    new Funcionario(nome);
                default ->
                    null;
            };

            if (p != null) {
                p.apresentar();
            }
        }
    }
}

