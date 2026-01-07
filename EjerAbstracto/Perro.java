public class Perro extends Animal implements HabilidadesEspeciales{
    private String raza;
    
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void moverCola(){
        System.out.println(getNombre()+" mueve la cola");
    }

    @Override
    public void competir() {
        System.out.println(getRaza()+" compite");
    }

    @Override
    public void realizarTruco() {
        System.out.println(getNombre()+" hace el truco de dar la pata");
    }

    @Override
    void hacerSonido() {
        System.out.println(getNombre()+" hace GUAU GUAU");
    }

    @Override
    public void dormir() {
        super.dormir();
    }
}
