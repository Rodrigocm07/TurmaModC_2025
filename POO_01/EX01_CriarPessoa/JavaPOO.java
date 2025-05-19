package EX01_CriarPessoa;


public class JavaPOO {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        
        p1.nome = "Rodrigo";
        p1.idade = 30;
        p1.altura = 1.69;
        
        p1.apresentar();
        
    }
}
