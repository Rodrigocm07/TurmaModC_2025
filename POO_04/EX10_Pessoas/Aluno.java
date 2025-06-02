package EX10_Pessoas;


class Aluno extends Pessoa {

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o aluno " + nome);
    }
}
