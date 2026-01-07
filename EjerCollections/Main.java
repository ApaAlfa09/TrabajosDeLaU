import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(5);
        list.add(15);
        list.add(10);
        list.add(25);
        list.add(20);

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        
    }
}