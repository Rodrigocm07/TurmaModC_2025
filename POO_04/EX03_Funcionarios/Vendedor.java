package EX03_Funcionarios;

class Vendedor extends Funcionario {

    public Vendedor(String n, double s) {
        super(n, s);
    }

    @Override
    public double calcularBonus() {
        return salario * 10.0;
    }
}
