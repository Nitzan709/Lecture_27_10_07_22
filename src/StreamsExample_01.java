import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamsExample_01 {
    public static void main(String[] args) {
        List<String> name0 = Arrays.asList("shampoo", "such", "ding");
        List<String> name1 = Arrays.asList("instant", "shoes", "deepen");
        List<String> name2 = Arrays.asList("profit", "loud", "toothpaste");

        List<List<String>> names = Arrays.asList(name0, name1, name2);

        names.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }

}
