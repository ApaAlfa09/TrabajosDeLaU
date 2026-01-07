import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNot = new ArrayList<>();

        listNot.add(10);
        listNot.add(9);
        listNot.add(8);

        System.out.println(Average.getAverage(listNot));
    }
    
}