package EX05_Impressora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Tipo: \n1 - Jato de Tinta \n2 - Laser");
            int op = sc.nextInt();
            sc.nextLine();
            
            Impressora imp = null;
            switch (op) {
                case 1 -> imp = new ImpressoraJatoDeTinta();
                case 2 -> imp = new ImpressoraLaser();
            }
            
            if (imp != null) {
                System.out.print("Documento para imprimir: ");
                String doc = sc.nextLine();
                imp.imprimir(doc);
            }
        }
    }

}
