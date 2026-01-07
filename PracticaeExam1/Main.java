public class Main {
    public static void main(String[] args){
        TemperaturaWS temperatura = new TemperaturaWS();
        HumedadWS humedad = new HumedadWS();
        PresionWS presion = new PresionWS();

        User user1 = new User("pedro", "sms");
        User user2 = new User("pepe", "email");
        User user3 = new User("pablo", "app");

        user1.setPhone("1234");
        user2.setEmail("pe@gmail.com");

        humedad.addObserver(user1);
        temperatura.addObserver(user1);

        presion.addObserver(user2);
        humedad.addObserver(user2);

        temperatura.addObserver(user3);
        presion.addObserver(user3);
        humedad.addObserver(user3);

        temperatura.cambioTemperatura("Temperatura");
        humedad.cambioHumedad("Humedad");
        presion.cambioPresion("Presion");
    }
}