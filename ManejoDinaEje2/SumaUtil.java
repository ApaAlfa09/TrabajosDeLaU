import java.util.ArrayList;

public class SumaUtil {
    
    
    public static int calculateTotalSum(ArrayList<Integer> numbersList) {
        int sum = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            sum += numbersList.get(i);
        }
        return sum;

    }

    public static int calculateFirtsHalfSum(ArrayList<Integer> numbersList) {
        int sumHalf = 0;
        for(int i = 0; i < numbersList.size()/2; i++){
            sumHalf += numbersList.get(i);
        }
        return sumHalf;
    }

    public static int calculateLastHalfSum(ArrayList<Integer> numbersList){
        int sumLast = 0;
        for(int i = numbersList.size()/2; i < numbersList.size(); i++){
            sumLast += numbersList.get(i);
        }
        return sumLast;
    }
}
