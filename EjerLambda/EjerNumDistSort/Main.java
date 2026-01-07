
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 3, 2, 3, 1, 5, 4, 2);

        List<Integer> result = numeros.stream()
            .distinct()
            .sorted()
            .toList();
        System.out.println(result);
    }
}