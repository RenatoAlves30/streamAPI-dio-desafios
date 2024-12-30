package dio.desafios;
import java.util.Arrays;
import java.util.List;

public class Desafio05 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        var numerosMaioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .count();
        var resultado = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, Integer::sum);


        System.out.println("A média dos números maiores que 5 é: " + resultado / numerosMaioresQueCinco);
    }

}
