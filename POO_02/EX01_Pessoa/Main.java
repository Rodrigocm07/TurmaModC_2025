package EX01_Pessoa;


public class Main {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Rodrigo", 21, 1.58);
        
        p.status();
        System.out.println("");
        p.setnome("Rodrigo Carvalho Machado");
        
        p.status();
    }
}
