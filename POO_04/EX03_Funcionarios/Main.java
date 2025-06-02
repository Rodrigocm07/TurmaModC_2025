package EX03_Funcionarios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            System.out.println("Cargo: \n1 - Gerente \n2 - Vendedor \n3 - Desenvolvedor");
            int op = sc.nextInt();

            Funcionario func = null;
            switch (op) {
                case 1 ->
                    func = new Gerente(nome, salario);
                case 2 ->
                    func = new Vendedor(nome, salario);
                case 3 ->
                    func = new Desenvolvedor(nome, salario);
            }

            if (func != null) {
                System.out.println("Bônus: " + func.calcularBonus());
            }
        }
    }
}
