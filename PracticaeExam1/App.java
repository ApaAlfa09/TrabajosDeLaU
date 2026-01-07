public class App implements Notificacion{

    @Override
    public void enviarMensaje(String mensaje) {
        IOManager.println("Enviando por app contenido: "+mensaje+"\n");
    }
    
}
