package the_hobbit_solution;

public class Main {
    public static void main(String[] args) {
        StreamHelper.words("The_Hobbit.txt")
                .forEach(System.out::println);
    }
}
