public class Main {
    public static void main(String[] args){
        HellRunnable runnable = new HellRunnable();

        /*Thread hilo = new Thread(() -> {
            System.out.println("Corriendo");
        });*/

        Thread hilo = new Thread(runnable);

        
        hilo.start();
    }
}
