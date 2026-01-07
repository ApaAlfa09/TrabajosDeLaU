public class Sale {
    private Customer customer;
    private Vehicle vehicle;
    private double amount;

    public Sale(Customer customer, Vehicle vehicle, double amount) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

}
