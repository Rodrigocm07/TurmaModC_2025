import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prova_01 {

public static List<Integer> Maiores(int[] n) {
        List<Integer> maiores = new ArrayList<>();

        int soma = 0;
        for (int num : n) {
            soma += num;
        }
        double media = (double) soma / n.length;

        for (int num : n) {
            if (num > media) {
                maiores.add(num);
            }
        }

        return maiores;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do Array: ");
        int tamanho = sc.nextInt();
        
        int[] numeros = new int[tamanho];
        
       System.out.println("Digite os números: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("número "+(i+1)+": ");
            numeros[i] = sc.nextInt();
        }
        
        List<Integer> resultado = Maiores(numeros);

        System.out.println("Números maiores que a média: " + resultado);
        //juro que eu pensei que tava certo :) por favor pensa com carinho no peso da minha nota :v
    }
}