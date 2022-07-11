import java.util.Arrays;

public class StreamExample_02 {
    Product[] products = {
            new Product(1, "lighten", 649.41),
            new Product(1, "black", 671.15),
            new Product(3, "lighten", 260.4),
            new Product(4, "lighten", 544.27),
            new Product(3, "guide", 717.01),
            new Product(1, "lighten", 310.16),
    };
    boolean match = Arrays.stream(products)
            .peek(System.out::println)
            .distinct()
            .noneMatch(product -> product.getPrice() > 800);
}
