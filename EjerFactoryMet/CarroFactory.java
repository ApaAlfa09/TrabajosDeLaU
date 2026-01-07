public class CarroFactory extends VeiculoFactory{
    @Override
    Vehiculo create() {
        return new Carro();
    }
}
