public class BmwFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(String brand, String model, double price) {
        return new Bmw(brand, model, price);
    }
}
