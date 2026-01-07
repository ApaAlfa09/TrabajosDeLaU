import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<Producto>{
    @Override
    public int compare(Producto p1, Producto p2) {
        return Integer.compare(p1.getPrice(), p2.getPrice());
    }
}
