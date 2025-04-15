
public class Prova_22 {

    public static void main(String[] args) {
        int[][] matriz = {
            {10, 5, 12, 3},
            {15, 2, 9, 8},
            {1, 16, 7, 14},
            {4, 13, 11, 6}
        };
        int maior = matriz[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("Maior elemento: " + maior);
    }
}
