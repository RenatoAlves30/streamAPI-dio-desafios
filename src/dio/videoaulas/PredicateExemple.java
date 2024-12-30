package dio.videoaulas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateExemple {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "Javascript", "C", "Go", "Ruby");

        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);

    }
}
