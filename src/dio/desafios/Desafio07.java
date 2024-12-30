package dio.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio07 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        var maiorNumero = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        maiorNumero
                .ifPresentOrElse(n -> System.out.println("Segundo maior número: " + n)
                , () -> System.out.println("A lista não possui elementos suficientes."));
    }

}
