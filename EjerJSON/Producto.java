import java.util.Arrays;

public class Producto {
    private String nombre;
    private double precio;
    private String[] categorias;
    
    public Producto(String nombre, double precio, String[] categorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.categorias = categorias;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String[] getCategorias() {
        return categorias;
    }
    public void setCategorias(String[] categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre 
        + ", precio=" + precio 
        + ", categorias=" 
        + Arrays.toString(categorias)+ "]";
    }

    

}
