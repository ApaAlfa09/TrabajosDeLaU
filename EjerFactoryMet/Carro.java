public class Carro extends Vehiculo{
    @Override
    void arrancar() {
        System.out.println("Carro arrancando");
    }

    @Override
    void frenar() {
        System.out.println("Carro frenando");
    }
}
