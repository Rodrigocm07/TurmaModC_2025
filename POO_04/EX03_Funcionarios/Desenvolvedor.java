package EX03_Funcionarios;


class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String n, double s) {
        super(n, s);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }
}
