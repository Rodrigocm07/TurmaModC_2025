
public class Prova_20 {

    public static void main(String[] args) {

        int[][] matriz = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean idt = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == j && matriz[i][j] != 1) {
                    idt = false;
                } else if (i != j && matriz[i][j] != 0) {
                    idt = false;
                }

            }
        }
        if (idt) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");

        }
    }
}
