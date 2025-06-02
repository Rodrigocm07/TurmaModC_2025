package EX02_Animais;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escolha o animal: \n1 - Cachorro \n2 - Gato \n3 - Vaca");
            int op = sc.nextInt();
            Animal animal = null;

            switch (op) {
                case 1 ->
                    animal = new Cachorro();
                case 2 ->
                    animal = new Gato();
                case 3 ->
                    animal = new Vaca();
            }

            if (animal != null) {
                animal.emitirSom();
            }
        }
    }
}
