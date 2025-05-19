
package EX05_Circulo;


public class circulo {

double raio;

double  calcularArea(){
    return Math.PI * Math.pow(raio, 2);
}
double calcularCircunferencia(){
    return 2 * Math.PI * raio;
}
}
