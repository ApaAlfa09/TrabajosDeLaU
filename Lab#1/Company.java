import java.util.ArrayList;
import java.util.List;

public class Company {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();
    List<Sale> sales = new ArrayList<>();

    public void addVehicle(String brand, String model, double price){
        if (brand.equals("BMW")) {
            BmwFactory bmwFactory = new BmwFactory();
            vehicles.add(bmwFactory.createVehicle(brand, model, price));
        }
        if (brand.equals("Toyota")) {
            ToyotaFactory toyotaFactory = new ToyotaFactory();
            vehicles.add(toyotaFactory.createVehicle(brand, model, price));
        }
        if (brand.equals("Ford")) {
            FordFactory fordFactory = new FordFactory();
            vehicles.add(fordFactory.createVehicle(brand, model, price));
        }

    }

    public void addCustomer(String name) {
        customers.add(new Customer(name));
    }

    public void sellVehicle(Vehicle vehicle, Customer customer, double amount) {
        Sale sale = new Sale(customer, vehicle, amount);
        sales.add(sale);
        vehicles.remove(vehicle);
    }

    public String getSalesByCustomerId(String id) {
        String salesByCustomer = "";
        for (Sale sale : sales) {
            if (sale.getCustomer().getId().equals(id)) {
                salesByCustomer += "Brand: " + sale.getVehicle().getBrand() + ", Amount: " + sale.getAmount();
            }
        }
        return salesByCustomer;
    }

    public double getProfitForVehicle(Vehicle vehiculo) {
        double expenses = 0;
        double acquisitionPrice = 0;
        double profit = 0;

        for (Double amount : vehiculo.getCostList()) {
            expenses += amount;
        }

        for (Sale sale : sales) {
            if (sale.getVehicle().getModel().equals(vehiculo.getModel())) {
                acquisitionPrice += sale.getAmount();
            }
        }

        profit = acquisitionPrice - (vehiculo.getPrice() + expenses);
        return profit;
    }

    public double getTotalProfit() {
        double price = 0;
        double expenses = 0;
        double acquisitionPrice = 0;
        double totalProfit = 0;

        for (Sale sale : sales) {
            for (Double amount : sale.getVehicle().getCostList()) {
                expenses += amount;
            }
            price += sale.getVehicle().getPrice();
            acquisitionPrice += sale.getAmount();
        }

        totalProfit = acquisitionPrice - (price + expenses);
        return totalProfit;
    }
}
