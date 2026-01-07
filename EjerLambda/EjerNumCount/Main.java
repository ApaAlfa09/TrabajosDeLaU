import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        long maores = Arrays.asList(10, 25, 30, 15, 40).stream()
            .filter(numero -> numero >= 30)
            .count();
        System.out.println("Mayores o iguales a 30: "+maores);
    }
}