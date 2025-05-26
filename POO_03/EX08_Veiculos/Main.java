package EX08_Veiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Veiculo carro = new Carro();
            int opcao;

            do {
                System.out.println("\n1 - Acelerar\n2 - Frear\n3 - Virar\n0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (opcao) {
                    case 1 -> carro.acelerar();
                    case 2 -> carro.frear();
                    case 3 -> { 
                        System.out.print("Direção (esquerda/direita): ");
                        String dir = scanner.nextLine();
                        carro.virar(dir);
                    }
                    case 0 -> System.out.println("Saindo do programa...");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            } while (opcao != 0); 
        }
    }
}
