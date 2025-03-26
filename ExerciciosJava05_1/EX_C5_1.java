package ExerciciosJava5_1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class EX_C5_1 {
    public static void main(String[] args) {
       
        int cont = 0;
        do{ 
            try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println(cont);
            cont ++;
            
        }while (cont <=10);
    }
}
