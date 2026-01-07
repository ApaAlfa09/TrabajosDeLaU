public class Main {
    public static void main(String[] args) {
        Estandar estandar = new Estandar();
        estandar.crearBarras();
        estandar.crearBombones();
        estandar.crearTableta();

        Premiun premiun = new Premiun();
        premiun.crearBarras();
        premiun.crearBombones();
        premiun.crearTableta();
    }
}
