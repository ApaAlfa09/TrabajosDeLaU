public class Customer {
    private String Id;
    private String name;

    public Customer(String name) {
        this.name = name;
    }   

    public Customer(String id, String name) {
        Id = id;
        this.name = name;
    }

    public String getId() {
        return Id;
    }
    public void setiD(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
