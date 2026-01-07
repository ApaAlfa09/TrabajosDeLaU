public class SMSNF implements NotificacionFactory{
    private SMS notificacion;

    public SMSNF(String phone) {
        notificacion = new SMS(phone);
    }

    @Override
    public Notificacion creaNotificacion() {
        return notificacion;
    }


}
