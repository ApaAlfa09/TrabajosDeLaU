import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        

        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);

        System.out.println(SumaUtil.calculateTotalSum(numbersList));

        System.out.println(SumaUtil.calculateFirtsHalfSum(numbersList));

        System.out.println(SumaUtil.calculateLastHalfSum(numbersList));

        if(SumaUtil.calculateFirtsHalfSum(numbersList) > SumaUtil.calculateLastHalfSum(numbersList)){
            System.out.println("The firts half sum is bigger them the last half sum");
        }else if (SumaUtil.calculateLastHalfSum(numbersList) > SumaUtil.calculateFirtsHalfSum(numbersList)) {
            System.out.println("The last half sum is bigger them the firts half sum");
        } else if (SumaUtil.calculateLastHalfSum(numbersList) == SumaUtil.calculateFirtsHalfSum(numbersList)){
            System.out.println("The last half sum is equal to the firts half sum");
        }
    }
}