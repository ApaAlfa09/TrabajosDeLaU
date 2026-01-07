import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis", "Carlos");

        nombres.stream()
            .forEach(nombre -> System.out.println("hola "+nombre));
    }
}