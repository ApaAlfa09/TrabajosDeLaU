public class Main{
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException{
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter++;
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter++;
            }
        });

        hilo1.start();
        hilo2.start();

        //hilo1.join();
        //hilo2.join();

        System.out.println("Counter final: "+counter);//esperado 200
    }
}