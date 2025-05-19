
package EX06_funcionarios;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            funcionarios f = new funcionarios();
            
            System.out.print("Digite seu nome: ");
            f.nome = sc.nextLine();
            
            System.out.print("Digite seu salario: ");
            f.salario = sc.nextDouble();
            
            sc.nextLine();
            
            System.out.print("Digite seu departamento: ");
            f.departamento = sc.nextLine();
            
            System.out.println("## CADASTRO ##");
            System.out.println("nome: "+f.nome);
            System.out.println("salario: "+f.salario);
            System.out.println("departamento: "+f.departamento);
            System.out.println("\n Seu salario de R$"+f.salario+" passará a ser de R$"+f.aumentarSalario(0.1));
        }
    }
}
