package EX05_Impressora;


class ImpressoraJatoDeTinta implements Impressora {
    @Override public void imprimir(String doc) {
        System.out.println("Imprimindo com jato de tinta: " + doc);
    }
}

