package EX14_Evento;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o nome do show: ");
        String nomeShow = sc.nextLine();
        System.out.print("Digite a data do show: ");
        String dataShow = sc.nextLine();
        System.out.print("Digite o nome do artista: ");
        String nomeArtista = sc.nextLine();
        
        Show meuShow = new Show (nomeShow, dataShow, nomeArtista);
        
        System.out.print("\nDigite o nome da palestra: ");
        String nomePalestra = sc.nextLine();
        System.out.print("Digite a data da palestra: ");
        String dataPalestra = sc.nextLine();
        System.out.print("Digite o nome do palestrante: ");
        String nomePalestrante = sc.nextLine();
        
        Palestra minhaPalestra = new Palestra(nomePalestra, dataPalestra, nomePalestrante);
        
        System.out.print("\nDigite o nome do Workshop: ");
        String nomeWorkshop = sc.nextLine();
        System.out.print("Digite a data do Workshop: ");
        String dataWorkshop = sc.nextLine();
        System.out.print("Digite o tema do workshop: ");
        String temaWorkshop = sc.nextLine();
        
        Workshop meuWorkshop = new Workshop(nomeWorkshop, dataWorkshop, temaWorkshop);
        
        System.out.println("\nEventos cadastrados: ");
        System.out.println("\nShow: "+meuShow.getNome()+" - Data: "+meuShow.getData()+" - Artista: "+meuShow.getArtista());
        System.out.println("Palestra: "+minhaPalestra.getNome()+" - Data: "+minhaPalestra.getData()+" - Palestrante: "+minhaPalestra.getPalestra());
        System.out.println("Workshop: "+meuWorkshop.getNome()+" - Data: "+meuWorkshop.getData()+ " - Tema: "+meuWorkshop.getTema());
        
        
        
    }
    
}
