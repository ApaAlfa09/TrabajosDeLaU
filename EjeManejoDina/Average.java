import java.util.ArrayList;

public class Average {
    public static double getAverage(ArrayList<Integer> notas){
        double sum = 0;
        for(int i = 0; i < notas.size(); i++){
            sum += notas.get(i);
        }
        double prom = 0.0;
        prom = sum / notas.size();

        return prom;
    }
}
