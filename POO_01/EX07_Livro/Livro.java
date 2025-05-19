package EX07_Livro;


public class Livro {
    String titulo;
    String Autor;
    int anoPublicacao;
    boolean disponivel;
    
    void emprestar(){
        if(disponivel){
            disponivel = false;
            System.out.println("Livro "+titulo+" emprestado com sucesso");
        }else{
            System.out.println("Livro "+titulo+" não está disponivel para emprestimo");
        }
    }
    void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("Livro "+titulo+" devolvido com sucesso");
        }else{
            System.out.println("Livro "+titulo+" já está disponivel");
        }
    }
}
