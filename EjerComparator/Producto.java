public class Producto implements Comparable<Producto>{
    private String name;
    private int price;
    private int quantity;

    public Producto(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Price: "+price+" Quantity: "+quantity;
    }

    @Override
    public int compareTo(Producto otroProd) {
        return Integer.compare(otroProd.quantity, this.quantity); //de forma descendente
    }
}