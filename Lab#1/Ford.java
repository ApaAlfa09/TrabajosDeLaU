public class Ford extends Vehicle{
    public Ford(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void oilChange() {
        double cost = 45 + (super.price * 0.001 );
        super.costList.add(cost);

    }

    @Override
    public void engineRepair() {
        double cost = 350 + (super.price * 0.001 );
        super.costList.add(cost);

    }

    @Override
    public void paintVehicle() {
        double cost = 180 + (super.price * 0.001 );
        super.costList.add(cost);

    }

    @Override
    public void changeOfTires() {
        double cost = 200;
        super.costList.add(cost);

    }
}
