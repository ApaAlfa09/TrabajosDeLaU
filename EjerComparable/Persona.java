public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" Edad: "+edad;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        int comparePerson = Integer.compare(this.edad, otraPersona.edad);
        if (comparePerson == 0) {
            return this.nombre.compareTo(otraPersona.nombre);
        }else{
            return comparePerson;
        }
    }

    
    
}