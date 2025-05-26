package EX01_ContaCorrente;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        ContaCorrente conta = new ContaCorrente();
        
        System.out.print("Digite o valor para depositar:");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        
        System.out.print("Digite o valor para sacar:");
        double saque = sc.nextDouble();
        conta.sacar(saque);
    }
    }

}
