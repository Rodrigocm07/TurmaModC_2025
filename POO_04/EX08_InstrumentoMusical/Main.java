package EX08_InstrumentoMusical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escolha: \n1 - Guitarra \n2 - Piano \n3 - Bateria ");
            int op = sc.nextInt();
            InstrumentoMusical inst = null;

            switch (op) {
                case 1 ->
                    inst = new Guitarra();
                case 2 ->
                    inst = new Piano();
                case 3 ->
                    inst = new Bateria();
                default ->
                    System.out.println("Opção inválida.");
            }

            if (inst != null) {
                inst.tocar();
            }
        }
    }
}
