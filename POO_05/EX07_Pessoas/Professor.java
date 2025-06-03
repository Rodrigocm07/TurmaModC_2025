package EX07_Pessoas;


public class Professor extends Pessoa {

    private final String disciplina;

    public Professor( String nome, int idade, String endereco, String disciplina) {
        super(nome, idade, endereco);
        this.disciplina = disciplina;
    }
    
        @Override
    public void exibirInfo() {
        super.exibirInfo();
            System.out.println("Disciplina: "+disciplina);
    }    
}
