import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    String brand;
    String model;
    double price;
    List<Double> costList = new ArrayList<>();

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public List<Double> getCostList() {
        return costList;
    }
    public void setCostList(List<Double> costList) {
        this.costList = costList;
    }

    abstract void oilChange();
    abstract void engineRepair();
    abstract void paintVehicle ();
    abstract void changeOfTires();

}