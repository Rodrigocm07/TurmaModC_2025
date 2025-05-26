package EX02_ContaBancaria;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o numero da conta: ");
        int n = sc.nextInt();
        
        System.out.print("Digite o saldo: ");
        double s = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Digite o titular: ");
        String t = sc.nextLine();
        
        Banco b = new Banco(n, s, t);
        
        b.numeroConta = n;
        b.saldo = s;
        b.titular = t;
        
        System.out.println("");
        b.status();
        
    System.out.print("\nDeseja depositar? (Sim/Não): ");
    String resposta = sc.nextLine().toLowerCase();

    b.depositar = resposta.equals("sim");

        if (b.depositar) {
    System.out.print("Digite o valor do depósito: ");
    double d = sc.nextDouble();
    
    b.depositar(d);
    System.out.println("");
    b.status();
       
        } else {
    System.out.println("Operação de depósito cancelada.");
}

    }
    
}
