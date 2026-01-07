public class PremiunFactory implements ChocolateFactory{
    @Override
    public Barra crearBarras() {
        return new Barra();
    }

    @Override
    public Bombom crearBombones() {
        return new Bombom();
    }

    @Override
    public Tableta crearTabletas() {
        return new Tableta();
    }
}
