package EX03_Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Cadastro do Carro");
            System.out.print("Digite a marca: ");
            String marca = sc.nextLine();
            
            System.out.print("Digite o modelo: ");
            String modelo = sc.nextLine();
            
            System.out.print("Digite o ano: ");
            int ano = sc.nextInt();
            sc.nextLine(); 
            
            carro meuCarro = new carro(marca, modelo, ano);
            
            int opcao;
            do {
                System.out.println("\n=== Menu do Carro ===");
                System.out.println("\n1. Ligar carro");
                System.out.println("2. Desligar carro");
                System.out.println("3. Exibir informações");
                System.out.println("0. Sair");
                System.out.print("\nEscolha uma opção: ");
                
                opcao = sc.nextInt();
                sc.nextLine(); 
                
                switch (opcao) {
                    case 1 -> meuCarro.ligar();
                    case 2 -> meuCarro.desligar();
                    case 3 -> meuCarro.status();
                    case 0 -> System.out.println("Saindo do sistema...");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            } while (opcao != 0);
        }
    }
}
        

