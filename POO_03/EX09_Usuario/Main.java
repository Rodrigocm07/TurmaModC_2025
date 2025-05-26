package EX09_Usuario;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Tipo de conta\n \n(1-Administrador):");
        int tipo = scanner.nextInt();
        
        Contas conta;
        if (tipo == 1) {
            conta = new Administrador();
        } else {
            System.out.println("Tipo inválido!");
            return;
        }
        
        conta.acessarSistema();
        conta.realizarOperacao();
    }
    }
}
