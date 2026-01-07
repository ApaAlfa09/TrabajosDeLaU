public class WaltingCycle{
    public static void main(String[] args) throws InterruptedException{
        Thread hiloMain = Thread.currentThread();
        System.out.println(hiloMain.getName());
        Thread hilo1 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(hiloMain.getState());
        });

        hilo1.start();
        hilo1.join();

        System.out.println("Hilo principal pudo terminar");
    }
}