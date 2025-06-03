package EX05_DispositivoEletronico;


public class Tablet extends DispositivoEletronico {

    private final double tamanhoTela;

    public Tablet(String modelo, String marca,double tamanhoTela) {
        super(modelo, marca);
        this.tamanhoTela = tamanhoTela;
    }
    
    @Override
     public void exibirInfo() {
         super.exibirInfo();
         System.out.println("Tamanho da tela: "+tamanhoTela);
     }
}
