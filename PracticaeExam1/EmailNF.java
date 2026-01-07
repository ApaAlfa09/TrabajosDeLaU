public class EmailNF implements NotificacionFactory{
    private Email notificacion;

    public EmailNF(String email){
        notificacion = new Email(email);
    }

    @Override
    public Notificacion creaNotificacion() {
        return notificacion;
    }
}
