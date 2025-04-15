
public class Prova_18 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        boolean identidade = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == j && matriz[i][j] != 1) {
                    identidade = false;
                } else if (i != j && matriz[i][j] != 0) {
                    identidade = false;
                }
            }
        }
        if (identidade) {
            System.out.println("A matriz é uma matriz identidade.");
            {

            }
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }
    }
}
