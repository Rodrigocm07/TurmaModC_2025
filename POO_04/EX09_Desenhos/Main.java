package EX09_Desenhos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escolha: \n1 - Círculo \n2 - Quadrado \n3 - Triângulo");
            int op = sc.nextInt();
            Desenho des = null;

            switch (op) {
                case 1 ->
                    des = new Circulo();
                case 2 ->
                    des = new Quadrado();
                case 3 ->
                    des = new Triangulo();
                default ->
                    System.out.println("Opção inválida.");
            }

            if (des != null) {
                des.desenhar();
            }
        }
    }
}

