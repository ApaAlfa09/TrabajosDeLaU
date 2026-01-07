public class Main {
    public static void main(String[] args) {
        CarroFactory carroFactory = new CarroFactory();
        Vehiculo carro = carroFactory.create();
        Vehiculo camion = new CamionFactory().create();
        Vehiculo moto = new MotoFactory().create();

        carro.arrancar();
        carro.frenar();

        moto.arrancar();
        moto.frenar();

        camion.arrancar();
        camion.frenar();
    }
}
