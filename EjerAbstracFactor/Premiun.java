public class Premiun implements Tabletas, Bombones, Barras{
    @Override
    public void crearBarras() {
        System.out.println("Se creo una barra Protein boost");
    }

    @Override
    public void crearBombones() {
        System.out.println("Se creo un bombom Gourmet assortment");
    }

    @Override
    public void crearTableta() {
        System.out.println("Se creo una tableta Dark Chocolate");
    }
}
