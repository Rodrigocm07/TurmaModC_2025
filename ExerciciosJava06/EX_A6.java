package ExerciciosJava6;

import java.util.Scanner;

public class EX_A6 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            
            double num1, num2, resultado;
            
            int menu;
            do {
                System.out.println("=====================");
                System.out.println("     CALCULADORA     ");
                System.out.println("=====================");
                System.out.println("[1] Soma             ");
                System.out.println("[2] Subtração        ");
                System.out.println("[3] Multiplicação    ");
                System.out.println("[4] Divisão          ");
                System.out.println("[5] Sair             ");
                System.out.print("Escolha uma opção: ");
                menu = teclado.nextInt();
                
                if (menu >= 1 && menu <= 4) {
                    System.out.print("Digite o primeiro número: ");
                    num1 = teclado.nextDouble();
                    
                    System.out.print("Digite o segundo número: ");
                    num2 = teclado.nextDouble();
                    
                    switch (menu) {
                        case 1 -> {
                            resultado = num1 + num2;
                            System.out.println("O resultado é: " + resultado);
                        }
                            
                        case 2 -> {
                            resultado = num1 - num2;
                            System.out.println("O resultado é: " + resultado);
                        }
                            
                        case 3 -> {
                            resultado = num1 * num2;
                            System.out.println("O resultado é: " + resultado);
                        }
                            
                        case 4 -> {
                            if (num2 != 0) {
                                resultado = num1 / num2;
                                System.out.println("O resultado é: " + resultado);
                            } else {
                                System.out.println("Erro: Divisão por zero não permitida.");
                            }
                        }
                    }
                } else if (menu == 5) {
                    System.out.println("\nSaindo do programa...");
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
                
            } while (menu != 5);
        }
    }
}
