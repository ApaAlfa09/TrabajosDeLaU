public class ToyotaFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle(String brand, String model, double price) {
        return new Toyota(brand, model, price); 
    }
    
}
