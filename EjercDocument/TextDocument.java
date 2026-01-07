public class TextDocument implements Document{
    @Override
    public void close() {
        System.out.println("Cerrando textDocument");
    }

    @Override
    public void open() {
        System.out.println("Abriendo textDocument");
    }

    @Override
    public void revent() {
        System.out.println("Invirtiendo textDocument");
    }

    @Override
    public void save() {
        System.out.println("Guardando textDocument");
    }
}
