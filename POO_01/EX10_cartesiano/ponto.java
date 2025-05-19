package EX10_cartesiano;

public class ponto {
    int x,y;
    
    double calcularDistancia(ponto outroPonto){
        int deltaX = x - outroPonto.x;
        int deltaY = y - outroPonto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
