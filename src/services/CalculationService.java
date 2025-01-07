package services;

import java.util.List;

public class CalculationService {

    // Método genérico para encontrar o maior elemento em uma lista.
    // O tipo T deve implementar a interface Comparable.
    public static <T extends Comparable<T>> T max(List<T> list) {
        // Verifica se a lista está vazia e lança uma exceção se estiver.
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        
        // Assume que o primeiro elemento da lista é o maior.
        T max = list.get(0);
        
        // Percorre a lista para encontrar o maior elemento.
        for (T item : list) {
            // Compara o elemento atual com o maior encontrado até agora.
            if (item.compareTo(max) > 0) {
                max = item; // Atualiza o maior elemento.
            }
        }
        
        // Retorna o maior elemento encontrado na lista.
        return max;
    }
}
