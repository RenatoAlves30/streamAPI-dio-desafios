package dio.videoaulas;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemple {

    public static void main(String[] args) {

        Supplier<String> saudacoes = () -> "Olá, seja bém-vindo";

        List<String> listaDeSaudades =
                Stream.generate(() -> "Olá, seja bem-vindo")
                        .limit(5)
                        .collect(Collectors.toList());

        listaDeSaudades.forEach(System.out::println);

    }
}
