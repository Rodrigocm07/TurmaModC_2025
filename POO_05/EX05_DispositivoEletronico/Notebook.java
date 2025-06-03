package EX05_DispositivoEletronico;


public class Notebook extends DispositivoEletronico {

    private final int armazenamento;

    public Notebook(String modelo, String marca,int armazenamento) {
        super(modelo, marca);
        this.armazenamento = armazenamento;
    }
    
     @Override
     public void exibirInfo() {
         super.exibirInfo();
         System.out.println("Capacidade de armazenamento: "+armazenamento);
     }
    
}
