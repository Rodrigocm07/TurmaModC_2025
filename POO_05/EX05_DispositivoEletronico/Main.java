package EX05_DispositivoEletronico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<DispositivoEletronico> dispositivos = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU ====");
                System.out.println("1 - Cadastrar Smartphone");
                System.out.println("2 - Cadastrar Tablet");
                System.out.println("3 - Cadastrar Notebook");
                System.out.println("4 - Exibir todos os dispositivos");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                sc.nextLine(); // limpar o buffer
                
                switch (op) {
                    case 1 -> {
                        System.out.print("Modelo do smartphone: ");
                        String modelo = sc.nextLine();
                        System.out.print("Marca: ");
                        String marca = sc.nextLine();
                        System.out.print("Tamanho da tela (polegadas): ");
                        double tela = sc.nextDouble();
                        sc.nextLine();
                        dispositivos.add(new Smartphone(modelo, marca, tela));
                        System.out.println("📱 Smartphone cadastrado com sucesso!");
                    }
                    
                    case 2 -> {
                        System.out.print("Modelo do tablet: ");
                        String modelo = sc.nextLine();
                        System.out.print("Marca: ");
                        String marca = sc.nextLine();
                        System.out.print("Tamanho da tela (polegadas): ");
                        double tela = sc.nextDouble();
                        sc.nextLine();
                        dispositivos.add(new Tablet(modelo, marca, tela));
                        System.out.println("📲 Tablet cadastrado com sucesso!");
                    }
                    
                    case 3 -> {
                        System.out.print("Modelo do notebook: ");
                        String modelo = sc.nextLine();
                        System.out.print("Marca: ");
                        String marca = sc.nextLine();
                        System.out.print("Armazenamento (em GB): ");
                        int armazenamento = sc.nextInt();
                        sc.nextLine();
                        dispositivos.add(new Notebook(modelo, marca, armazenamento));
                        System.out.println("💻 Notebook cadastrado com sucesso!");
                    }
                    
                    case 4 -> {
                        if (dispositivos.isEmpty()) {
                            System.out.println("Nenhum dispositivo cadastrado.");
                        } else {
                            System.out.println("\n=== DISPOSITIVOS CADASTRADOS ===");
                            for (DispositivoEletronico d : dispositivos) {
                                System.out.println("--------------");
                                d.exibirInfo();
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
