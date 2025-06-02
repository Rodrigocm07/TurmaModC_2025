package EX10_Pessoas;


class Funcionario extends Pessoa {

    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o funcionário " + nome);
    }
}
