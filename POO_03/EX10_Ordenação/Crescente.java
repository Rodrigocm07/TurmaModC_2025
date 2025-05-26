package EX10_Ordenação;

import java.util.Collections;
import java.util.List;


class Crescente implements Ordenacao<Integer> {
    @Override
    public void ordenar(List<Integer> lista) {
        Collections.sort(lista);
    }
}

