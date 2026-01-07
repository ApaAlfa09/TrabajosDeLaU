
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        //PUNTO 1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        numeros.stream()
            .forEach(numero -> System.out.println(numero+""));

        //PUNTO 2
        List<Integer> resultados = numeros.stream()
            .map(numero -> numero + 1)
            .toList();
        System.out.println(resultados);

        numeros.stream()
            .filter(numero -> numero > 7)
            .forEach(numero -> System.out.println(numero+""));

        //PUNTO 3
        List<String> palabaras = Arrays.asList("Papa", "Mesa", "Telefono", "Pipa");

        palabaras.stream()
            .filter(palabra -> palabra.startsWith(String.valueOf("P")))
            .forEach(palabra -> System.out.print(palabra+" "));

        //PUNTO 4
        List<Persona> personas = Arrays.asList(new Persona(18), new Persona(26), new Persona(10), new Persona(37));
        Collections.sort(personas, (p1, p2) -> Integer.compare(p1.edad, p2.edad));
        personas.stream()
            .forEach(persona -> System.out.println(persona.edad+""));

        
    }
}