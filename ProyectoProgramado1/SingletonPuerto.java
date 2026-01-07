public class SingletonPuerto{
    private static SingletonPuerto instance;
    private int puerto = 5000;

    private SingletonPuerto() {
        
    }

    

    public static SingletonPuerto getInstance() {
        if (instance == null) {
            instance = new SingletonPuerto();
        }
        return instance;
    }

    public int getPuerto() {
        return puerto;
    }
}