import java.util.List;

public class Animal {
    private String nombre;
    private String tipo;
    private List<Cita> citas;

    public Animal(String nombre, String tipo, List<Cita> citas) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Cita> getCitas() {
        return citas;
    }
    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", citas=" + citas + "]";
    }

}
