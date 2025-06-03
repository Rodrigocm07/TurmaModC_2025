package EX10_Geométricas3D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU ====");
                System.out.println("1 - Calcular volume do Cubo");
                System.out.println("2 - Calcular volume da Esfera");
                System.out.println("3 - Calcular volume do Cilindro");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                
                FiguraGeometrica3D figura = null;
                
                switch (op) {
                    case 1 -> {
                        System.out.print("Digite o lado do cubo: ");
                        double lado = sc.nextDouble();
                        figura = new Cubo(lado);
                    }
                    
                    case 2 -> {
                        System.out.print("Digite o raio da esfera: ");
                        double raio = sc.nextDouble();
                        figura = new Esfera(raio);
                    }
                    
                    case 3 -> {
                        System.out.print("Digite o raio do cilindro: ");
                        double raio = sc.nextDouble();
                        System.out.print("Digite a altura do cilindro: ");
                        double altura = sc.nextDouble();
                        figura = new Cilindro(raio, altura);
                    }
                    
                    case 0 -> {
                        System.out.println("Encerrando o programa...");
                        break;
                    }
                    
                    default -> {
                        System.out.println("Opção inválida.");
                        continue;
                    }
                }
                
                if (figura != null) {
                    System.out.printf("Volume calculado: %.2f/n", figura.calcularVolume());
                }
                
            } while (op != 0);
        }
    }
}
