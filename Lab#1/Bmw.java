public class Bmw extends Vehicle{
    public Bmw(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void oilChange() {
       double cost = 30 + (super.price * 0.002);
        super.costList.add(cost);

    }

    @Override
    public void engineRepair() {
        double cost = 200 + (super.price * 0.002);
        super.costList.add(cost);

    }

    @Override
    public void paintVehicle() {
        double cost = 100 + (super.price * 0.002);
        super.costList.add(cost);  
    
    }

    @Override
    public void changeOfTires() {
        double cost = 300;
        super.costList.add(cost);

    }
}
