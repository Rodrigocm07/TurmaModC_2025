package EX02_ContaBancaria;

public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "12345-6";
        conta1.titular = "Rodrigo";
        conta1.saldo = 20.0;
        
        conta1.depositar(200);
        conta1.sacar(50);
        
    }
}
