import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Persona> listPerson = new LinkedList<>();

        listPerson.add(new Persona("josu", 19));
        listPerson.add(new Persona("fred", 18));
        listPerson.add(new Persona("ale", 5));
        listPerson.add(new Persona("kata", 5));

        System.out.println(listPerson);

        Collections.sort(listPerson);

        for (Persona persona : listPerson) {
            System.out.println(persona);
        }
    }
}
 /*con 0 es cuando van a ver dos edades iguales entonces por el if los compara por nombre 
 con 1 es cuando ordena por edades de menor a mayor porque compara el this y es menor que el otro
 con -1 es cuando ordena por nombres alfabeticamente de menor a mayor porque compara el this y es mayor que otro*/
 //me encanta tu pelito