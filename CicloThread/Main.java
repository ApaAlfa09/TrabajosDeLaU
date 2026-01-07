public class Main{
    public static int count;
    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = () -> recurso();
        Thread hilo1 = new Thread(runnable);
        Thread hilo2 = new Thread(runnable);

        hilo1.start();
        hilo2.start();

        Thread.sleep(1000);
        System.out.println(hilo2.getState());
    }

    public static synchronized void recurso(){
        count++;
        try {
            Thread.sleep(5000);//simula una operacion larga
            System.out.println(String.format("Desocupado por el hilo %s", count));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}