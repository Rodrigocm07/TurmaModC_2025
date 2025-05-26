package EX05_Funcionario;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Horas trabalhadas:");
        double horas = scanner.nextDouble();
        
        System.out.print("Valor por hora:");
        double valor = scanner.nextDouble();
        
        Pagamento funcionario = new Funcionario(horas, valor);
        System.out.println("Pagamento: R$" + funcionario.calcularPagamento());
    }
    }
}
