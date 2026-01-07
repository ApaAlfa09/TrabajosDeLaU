public class SMS implements Notificacion{
    private String phone;

    public SMS(String phone) {
        this.phone = phone;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        IOManager.println(String.format("Enviando por sms a %s contenido: %s\n", phone, mensaje));
    }

}