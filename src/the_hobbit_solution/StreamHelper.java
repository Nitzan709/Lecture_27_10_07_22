package the_hobbit_solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamHelper {
    public static Stream<String> words(String filePath){
        try {
            return Files.lines(Path.of(filePath))
                    .flatMap(line -> Stream.of(line.split(" +")))
                    .filter(Predicate.not(String::isBlank));
        }catch (IOException e){
            throw new RuntimeException("failed to streamline the file: " + filePath);
        }
    }
}
