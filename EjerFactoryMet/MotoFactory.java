public class MotoFactory extends VeiculoFactory{
    @Override
    Vehiculo create() {
        return new Moto();
    }
}
