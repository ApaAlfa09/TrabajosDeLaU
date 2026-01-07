public class Estandar implements Tabletas, Bombones, Barras{
    @Override
    public void crearBarras() {
        System.out.println("Se creo una barra Energy bar");
    }

    @Override
    public void crearBombones() {
        System.out.println("Se creo un bombom Mixed flavors");
    }

    @Override
    public void crearTableta() {
        System.out.println("Se creo una tableta Milk cocolate");
    }
}
