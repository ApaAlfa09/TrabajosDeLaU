public class User implements Observer{
    private String nombre;
    private String phone;
    private String email;
    private String tipoNotificacion;

    public User(String nombre, String tipoNotificacion) {
        this.nombre = nombre;
        this.tipoNotificacion = tipoNotificacion;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(String tipo) {
        Notificacion notificacion = crearNotificacion();
        notificacion.enviarMensaje(String.format("Hola %s, notificacion de %s: ha cambiado", nombre, tipo));
    }

    public Notificacion crearNotificacion(){
        switch (tipoNotificacion.toLowerCase()) {
            case "sms":
                return new SMSNF(phone).creaNotificacion();
            case "email":
                return new EmailNF(email).creaNotificacion();
            case "app":
                return new AppNF().creaNotificacion();
            default:
                throw new AssertionError();
        }
    }

}
