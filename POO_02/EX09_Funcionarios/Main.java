package EX09_Funcionarios;

import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
         System.out.print("Nome do funcionário: ");
         String nome = sc.nextLine();
         
         System.out.print("Salário: ");
         double salario = sc.nextDouble();
         sc.nextLine(); // Limpa o buffer
         
         System.out.print("Departamento: ");
         String departamento = sc.nextLine();
         
         Funcionarios funcionario = new Funcionarios(nome, salario, departamento);
         
         int opcao;
         do {
             System.out.println("\n----- MENU -----");
             System.out.println("1 - Ver status");
             System.out.println("2 - Aumentar salário");
             System.out.println("0 - Sair");
             System.out.print("Escolha uma opção: ");
             opcao = sc.nextInt();
             sc.nextLine();
             
             switch (opcao) {
                 case 1 -> funcionario.status();
                 case 2 -> {
                     System.out.print("Informe o percentual de aumento: ");
                     double percentual = sc.nextDouble();
                     funcionario.aumentarSalario(percentual);
                 }
                 case 0 -> System.out.println("Encerrando...");
                 default -> System.out.println("Opção inválida.");
             }
         } while (opcao != 0);
     }
    }
}
