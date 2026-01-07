import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
            .map(number -> number * 2)
            .toList();
        System.out.println(result);
    }
}