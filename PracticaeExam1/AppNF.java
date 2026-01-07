public class AppNF implements NotificacionFactory{

    @Override
    public Notificacion creaNotificacion() {
        return new App();
    }
    
}
