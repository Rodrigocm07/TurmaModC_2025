package EX07_Pessoas;


public class Aluno extends Pessoa {

    private final int matricula;

    public Aluno(String nome, int idade, String endereco, int matricula) {
        super(nome, idade, endereco);
        this.matricula = matricula;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matricula: "+matricula);
    }
    
}
