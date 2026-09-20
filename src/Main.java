import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // список
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // 1. чи число парне?
        // true/false
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // *10
        Function<Integer, Integer> multiply = n -> n * 10;

        // 3. Consumer виводить на екран
        Consumer<Integer> showResult = n -> System.out.println("Результат: " + n);


        for (Integer num : numbers) {

            if (isEven.test(num)) {

                int transformed = multiply.apply(num);

                showResult.accept(transformed);
            }
        }
    }
}