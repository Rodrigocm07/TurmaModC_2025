package EX12_Porta;

import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
         System.out.print("Informe a cor da porta: ");
         String cor = sc.nextLine();
         
         System.out.print("A porta está aberta? (true/false): ");
         boolean aberta = sc.nextBoolean();
         
         Porta porta = new Porta(aberta, cor);
         
         int opcao;
         do {
             System.out.println("\n----- MENU -----");
             System.out.println("1 - Ver status");
             System.out.println("2 - Abrir porta");
             System.out.println("3 - Fechar porta");
             System.out.println("4 - Alterar cor");
             System.out.println("0 - Sair");
             System.out.print("Escolha uma opção: ");
             opcao = sc.nextInt();
             sc.nextLine(); // Limpa buffer
             
             switch (opcao) {
                 case 1 -> porta.status();
                 case 2 -> porta.abrir();
                 case 3 -> porta.fechar();
                 case 4 -> {
                     System.out.print("Nova cor: ");
                     porta.setCor(sc.nextLine());
                 }
                 case 0 -> System.out.println("Encerrando...");
                 default -> System.out.println("Opção inválida.");
             }
         } while (opcao != 0);
     }
    }
}
