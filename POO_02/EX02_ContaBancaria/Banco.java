package EX02_ContaBancaria;

public class Banco {

int numeroConta;
double saldo;
String titular;
boolean depositar;

    public Banco(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void status(){
        System.out.println("===== CONTA BANCARIA =====");
        System.out.println("Numero da conta: "+this.getNumeroConta());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Titular: "+this.getTitular());
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
 public boolean depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
        System.out.println("\nDepósito de R$" + valor + " realizado com sucesso!");
        return true; 
    } else {
        System.out.println("\nO valor do depósito deve ser positivo.");
        return false; 
    }
}

    
}
