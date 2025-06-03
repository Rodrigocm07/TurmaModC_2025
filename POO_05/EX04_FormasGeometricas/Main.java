package EX04_FormasGeometricas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU ====");
                System.out.println("1 - Calcular área do Círculo");
                System.out.println("2 - Calcular área do Retângulo");
                System.out.println("3 - Calcular área do Triângulo");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                
                FormaGeometrica forma = null;
                
                switch (op) {
                    case 1 -> {
                        System.out.print("Digite o raio do círculo: ");
                        double raio = sc.nextDouble();
                        forma = new Circulo(raio);
                    }
                    
                    case 2 -> {
                        System.out.print("Digite a largura do retângulo: ");
                        double largura = sc.nextDouble();
                        System.out.print("Digite a altura do retângulo: ");
                        double altura = sc.nextDouble();
                        forma = new Retangulo(largura, altura);
                    }
                    
                    case 3 -> {
                        System.out.print("Digite a base do triângulo: ");
                        double base = sc.nextDouble();
                        System.out.print("Digite a altura do triângulo: ");
                        double altura = sc.nextDouble();
                        forma = new Triangulo(base, altura);
                    }
                    
                    case 0 -> {
                        System.out.println("Encerrando programa...");
                        break;
                    }
                    
                    default -> {
                        System.out.println("Opção inválida.");
                        continue;
                    }
                }
                
                if (forma != null) {
                    System.out.printf("Área calculada: %.2f\n", forma.calcularArea());
                }
                
            } while (op != 0);
        }
    }
}
