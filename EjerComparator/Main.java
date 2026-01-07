import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listProduc = new ArrayList<>();

        addProduct(listProduc, "lentes", 100, 34);
        addProduct(listProduc, "gorra", 55, 80);
        addProduct(listProduc, "lapiz", 25, 80);
        addProduct(listProduc, "cuuaderno", 78, 96);

        Collections.sort(listProduc);
        printList(listProduc);
        Collections.sort(listProduc, new ComparadorPorNombre());
        printList(listProduc);
        Collections.sort(listProduc, new ComparadorPorPrecio());
        printList(listProduc);

    }

    public static void addProduct(ArrayList lista, String name, int price, int quantity){
        Producto product = new Producto(name, price, quantity);
        lista.add(product);
    }

    public static void printList(ArrayList list){
        System.out.println(list);
    }
}
