public class ProductDescri {
    private String nombre;
    private Double precio;
    private String descripcion;

    public ProductDescri(String nombre, Double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = null;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ProductDescri [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + "]";
    }

    
}
