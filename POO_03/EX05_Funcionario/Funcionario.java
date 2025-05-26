package EX05_Funcionario;


public class Funcionario implements Pagamento {
private final double horasTrabalhadas;
    private final double valorHora;

    public Funcionario(double horas, double valor) {
        this.horasTrabalhadas = horas;
        this.valorHora = valor;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

}
