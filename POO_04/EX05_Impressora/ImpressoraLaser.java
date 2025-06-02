package EX05_Impressora;


class ImpressoraLaser implements Impressora {
    @Override public void imprimir(String doc) {
        System.out.println("Imprimindo com laser: " + doc);
    }
}
