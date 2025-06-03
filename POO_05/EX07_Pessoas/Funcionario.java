package EX07_Pessoas;


public class Funcionario extends Pessoa {

    private final String cargo;

    public Funcionario(String nome, int idade, String endereco, String cargo) {
        super(nome, idade, endereco);
        this.cargo = cargo;
    }
    
            @Override
    public void exibirInfo() {
        super.exibirInfo();
            System.out.println("Cargo: "+cargo);
    }    
    
}
