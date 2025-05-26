package EX01_Pessoa;


public class Pessoa {

     String nome;
     int idade;
     double altura;
    
    public Pessoa (String nome, int idade, double altura){
            
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        
    }
    
    public void status (){
        System.out.println("======= documento =======");
        System.out.println("Nome: "+this.getnome());
        System.out.println("idade: "+this.getidade());
        System.out.println("Altura: "+this.getaltura());
    }
    
        public String getnome() {
            return nome;
    }
        public void setnome(String nome){
            this.nome = nome;
        }
        
        public int getidade(){
            return idade;
        }
        public void setidade(int idade){
            this.idade = idade;
        }
        public double getaltura(){
            return altura;
        }
        public void setaltura(double altura){
            this.altura = altura;
        }
    
}
