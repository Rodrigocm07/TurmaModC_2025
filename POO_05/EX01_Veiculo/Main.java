package EX01_Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int op;

            do {
                System.out.println("\n==== Menu ====");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Caminhão");
                System.out.println("4 - Exibir todos os veículos");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1 -> {
                        System.out.print("Marca do carro: ");
                        String marca = sc.nextLine();
                        System.out.print("Modelo do carro: ");
                        String modelo = sc.nextLine();
                        System.out.print("Ano do carro: ");
                        int ano = sc.nextInt();
                        System.out.print("Número de portas: ");
                        int portas = sc.nextInt();
                        sc.nextLine();
                        veiculos.add(new Carro(marca, modelo, ano, portas));
                        System.out.println("Carro cadastrado com sucesso!");
                    }

                    case 2 -> {
                        System.out.print("Marca da moto: ");
                        String marca = sc.nextLine();
                        System.out.print("Modelo da moto: ");
                        String modelo = sc.nextLine();
                        System.out.print("Ano da moto: ");
                        int ano = sc.nextInt();
                        System.out.print("Cilindradas: ");
                        int cilindradas = sc.nextInt();
                        sc.nextLine();
                        veiculos.add(new Moto(marca, modelo, ano, cilindradas));
                        System.out.println("Moto cadastrada com sucesso!");
                    }

                    case 3 -> {
                        System.out.print("Marca do caminhão: ");
                        String marca = sc.nextLine();
                        System.out.print("Modelo do caminhão: ");
                        String modelo = sc.nextLine();
                        System.out.print("Ano do caminhão: ");
                        int ano = sc.nextInt();
                        System.out.print("Capacidade de carga (toneladas): ");
                        double carga = sc.nextDouble();
                        sc.nextLine();
                        veiculos.add(new Caminhao(marca, modelo, ano, carga));
                        System.out.println("Caminhão cadastrado com sucesso!");
                    }

                    case 4 -> {
                        if (veiculos.isEmpty()) {
                            System.out.println("Nenhum veículo cadastrado.");
                        } else {
                            System.out.println("\n=== VEÍCULOS CADASTRADOS ===");
                            for (Veiculo v : veiculos) {
                                System.out.println("--------------");
                                v.exibirInfo();
                            }
                        }
                    }

                    case 0 ->
                        System.out.println("Encerrando programa...");
                    default ->
                        System.out.println("Opção inválida!");
                }
            } while (op != 0);
        }
    }
}
