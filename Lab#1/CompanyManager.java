public class CompanyManager {
    public void run(){
        Company company = new Company();
        Customer customer = new Customer("123", "Pedro");

        company.addCustomer(customer.getName());

        company.addVehicle("BMW", "X5", 50000);
        company.addVehicle("Toyota", "Corolla", 20000);
        company.addVehicle("Ford", "Mustang", 30000);

        Vehicle bmw = company.vehicles.get(0);
        Vehicle toyota = company.vehicles.get(1);
        Vehicle ford = company.vehicles.get(2);

        bmw.oilChange();
        bmw.engineRepair();
        bmw.paintVehicle();
        bmw.changeOfTires();

        toyota.oilChange();
        toyota.engineRepair();
        toyota.paintVehicle();
        toyota.changeOfTires();

        ford.oilChange();
        ford.engineRepair();
        ford.paintVehicle();
        ford.changeOfTires();

        company.sellVehicle(bmw, customer, 55000);
    
        System.out.println("The vehicle's profit is: " + company.getProfitForVehicle(bmw));
        System.out.println("Custumer sales: " +"\n" + company.getSalesByCustomerId("123"));
        System.out.println("The company total profit is: " + company.getTotalProfit());
    }
}