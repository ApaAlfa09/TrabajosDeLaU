public class Email implements Notificacion{
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        IOManager.println(String.format("Enviando por mail a %s contenido: %s\n",email, mensaje));
    }
    
}