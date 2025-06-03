package EX09_Eletrodomestico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Eletrodomestico> eletros = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU ====");
                System.out.println("1 - Cadastrar Televisão");
                System.out.println("2 - Cadastrar Geladeira");
                System.out.println("3 - Cadastrar Micro-ondas");
                System.out.println("4 - Exibir todos os eletrodomésticos");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                sc.nextLine(); // Limpa buffer
                
                switch (op) {
                    case 1 -> {
                        System.out.print("Marca da TV: ");
                        String marca = sc.nextLine();
                        System.out.print("Modelo da TV: ");
                        String modelo = sc.nextLine();
                        System.out.print("Está ligada? (true/false): ");
                        boolean ligado = sc.nextBoolean();
                        System.out.print("Canal atual: ");
                        int canal = sc.nextInt();
                        System.out.print("Volume atual: ");
                        int volume = sc.nextInt();
                        sc.nextLine(); // Limpa buffer
                        eletros.add(new Televisao(marca, modelo, ligado, canal, volume));
                        System.out.println("📺 Televisão cadastrada com sucesso!");
                    }
                    
                    case 2 -> {
                        System.out.print("Marca da geladeira: ");
                        String marca = sc.nextLine();
                        System.out.print("Modelo da geladeira: ");
                        String modelo = sc.nextLine();
                        System.out.print("Está ligada? (true/false): ");
                        boolean ligado = sc.nextBoolean();
                        System.out.print("Temperatura: ");
                        int temperatura = sc.nextInt();
                        sc.nextLine(); // Limpa buffer
                        eletros.add(new Geladeira(marca, modelo, ligado, temperatura));
                        System.out.println("🧊 Geladeira cadastrada com sucesso!");
                    }
                    
                    case 3 -> {
                        System.out.print("Marca do micro-ondas: ");
                        String marca = sc.nextLine();
                        System.out.print("Modelo do micro-ondas: ");
                        String modelo = sc.nextLine();
                        System.out.print("Está ligado? (true/false): ");
                        boolean ligado = sc.nextBoolean();
                        System.out.print("Potência: ");
                        int potencia = sc.nextInt();
                        sc.nextLine(); // Limpa buffer
                        eletros.add(new Microondas(marca, modelo, ligado, potencia));
                        System.out.println("🍽️ Micro-ondas cadastrado com sucesso!");
                    }
                    
                    case 4 -> {
                        if (eletros.isEmpty()) {
                            System.out.println("Nenhum eletrodoméstico cadastrado.");
                        } else {
                            System.out.println("\n=== ELETRODOMÉSTICOS CADASTRADOS ===");
                            for (Eletrodomestico e : eletros) {
                                System.out.println("--------------");
                                e.exibirInfo();
                            }
                        }
                    }
                    
                    case 0 -> System.out.println("Encerrando programa...");
                    default -> System.out.println("Opção inválida.");
                }
                
            } while (op != 0);
        }
    }
}
