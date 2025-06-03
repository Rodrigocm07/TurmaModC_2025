package EX03_Funcionarios;


public class Desenvolvedor extends Funcionarios{

    private final String programacao;

    public Desenvolvedor( String nome, double salario, String cargo, String programacao) {
        super(nome, salario, cargo);
        this.programacao = programacao;
    }
    
     @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Linguagem de programção: " + programacao);
    }
    
}
