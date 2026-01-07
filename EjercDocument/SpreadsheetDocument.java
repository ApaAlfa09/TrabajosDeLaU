public class SpreadsheetDocument implements Document{
    @Override
    public void close() {
        System.out.println("Cerrando SpreadsheetDocument");
    }

    @Override
    public void open() {
        System.out.println("Abriendo SpreadsheetDocument");
    }

    @Override
    public void revent() {
        System.out.println("Invirtiendo SpreadsheetDocument");
    }

    @Override
    public void save() {
        System.out.println("Guardando SpreadsheetDocument");
    }
}
