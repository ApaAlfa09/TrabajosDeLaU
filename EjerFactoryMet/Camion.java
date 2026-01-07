public class Camion extends Vehiculo{
    @Override
    void arrancar() {
        System.out.println("Camion arrancando");
    }

    @Override
    void frenar() {
        System.out.println("Camion frenando");
    }
}
