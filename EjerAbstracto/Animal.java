public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(){

    }

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    abstract void hacerSonido();

    public void dormir(){
        System.out.println(nombre+" esta drmiendo");
    }

    public void prueba(){
        System.out.println("Este es el papa");
    }
}
