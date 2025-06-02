package EX03_Funcionarios;

class Gerente extends Funcionario {

    public Gerente(String n, double s) {
        super(n, s);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}
