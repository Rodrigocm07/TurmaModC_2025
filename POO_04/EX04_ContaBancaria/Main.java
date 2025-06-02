package EX04_ContaBancaria;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Número da conta: ");
            String num = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.println("Tipo: \n1 - Corrente \n2 - Poupança");
            int op = sc.nextInt();
            
            ContaBancaria conta = null;
            if (op == 1) {
                System.out.print("Limite: ");
                double lim = sc.nextDouble();
                conta = new ContaCorrente(num, saldo, lim);
            } else if (op == 2) {
                System.out.print("Taxa rendimento: ");
                double taxa = sc.nextDouble();
                conta = new ContaPoupanca(num, saldo, taxa);
            }
            
            if (conta != null) {
                System.out.println("\n1 - Depositar \n2 - Sacar \n3 - Consultar");
                int oper = sc.nextInt();
                switch (oper) {
                    case 1 -> {
                        System.out.print("Valor depósito: ");
                        conta.depositar(sc.nextDouble());
                    }
                    case 2 -> {
                        System.out.print("Valor saque: ");
                        conta.sacar(sc.nextDouble());
                    }
                    case 3 -> conta.consultarSaldo();
                }
            }
        }
    }

}
