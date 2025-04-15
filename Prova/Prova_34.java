
public class Prova_34 {

    public static void main(String[] args) {
        int[][] matriz = { 
            {10, 5, 12, 3},
            {15, 2, 9, 8},
            {1, 16, 7, 14},
            {4, 13, 11, 6}
        };
        int menor = matriz[0][0];
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
                if (matriz[i][j] < menor) { 
                menor = matriz[i][j];    
                }
            }
        }

        System.out.println("Menor elemento: " + menor); 
    }
}
