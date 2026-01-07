public class Gato extends Animal{
    private boolean tienePelajeLargo;

    public Gato(String nombre, int edad, boolean tienePelajeLargo) {
        super(nombre, edad);
        this.tienePelajeLargo = tienePelajeLargo;
    }

    @Override
    void hacerSonido() {

    }

    public void ronrronear(){
        System.out.println(getNombre()+" esta ronrroneando");
    }
}
