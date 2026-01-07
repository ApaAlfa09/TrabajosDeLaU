public class Toyota extends Vehicle{
    
    public Toyota(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void oilChange() {
        double cost = 50 + (super.price * 0.001 );
        super.costList.add(cost);

    }

    @Override
    public void engineRepair() {
        double cost = 300 + (super.price * 0.001 );
        super.costList.add(cost);

    }

    @Override
    public void paintVehicle() {
        double cost = 200 + (super.price * 0.001 );
        super.costList.add(cost);

    }

    @Override
    public void changeOfTires() {
        double cost = 100;
        super.costList.add(cost);

    }
}
