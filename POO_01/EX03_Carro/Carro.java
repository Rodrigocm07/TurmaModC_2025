package EX03_Carro;


public class Carro {

    String marca;
    String modelo;
    int ano;
    boolean ligado;
    
    void ligar(){
        if (ligado) {
            ligado = false;
            System.out.println("Carro "+marca+" "+modelo+" "+ano+" está ligado.");
        }else{
            System.out.println("Carro "+marca+" "+modelo+" "+ano+" não foi ligado.");
        }
    }
    void desligar(){
        if(ligado){
            ligado = true;
            System.out.println("Carro "+marca+" "+modelo+" "+ano+" está desligado.");
        }else{
            System.out.println("Carro "+marca+" "+modelo+" "+ano+" ainda está ligado.");
        }
    }
}
