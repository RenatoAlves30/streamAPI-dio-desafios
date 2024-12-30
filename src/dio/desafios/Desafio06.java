package dio.desafios;

import java.util.List;
import java.util.Arrays;

public class Desafio06 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        numeros.stream()
                .map(n -> n > 10 ? "O número " + n + " é maior que 10" : "O número " + n + " não é maior que 10")
                .toList()
                .forEach(System.out::println);

    }

}
