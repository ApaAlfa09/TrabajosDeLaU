public class CamionFactory extends VeiculoFactory{
    @Override
    Vehiculo create() {
        return new Camion();
    }
}
