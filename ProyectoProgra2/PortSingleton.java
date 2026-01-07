public class PortSingleton {

    private static PortSingleton instance;
    private int port = 5000;

    private PortSingleton() {}
    

    public static synchronized PortSingleton getInstance() {
        if (instance == null) {
            instance = new PortSingleton();
        }
        return instance;
    }

    public int getPort() {
        return port;
    }

}