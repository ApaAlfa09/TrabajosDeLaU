import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fruit> listaFrutas = List.of(new Manzana(), new Banana(), new Manzana(), new Banana());

        //listaFrutas.forEach(fruit -> System.out.println(fruit.getName()));

        listaFrutas.stream()
            .map(fruit -> fruit.getName())
            .distinct() //manzana, banano, manzana
            .sorted((fruit1, fruit2) -> fruit2.compareTo(fruit1))
            .forEach(name -> System.out.println("La fruta es: "+name));
    }
}
