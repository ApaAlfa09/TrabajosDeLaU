public class FordFactory extends VehicleFactory{
    @Override
    Vehicle createVehicle(String brand, String model, double price) {
        return new Ford(brand, model, price);
    }
}
