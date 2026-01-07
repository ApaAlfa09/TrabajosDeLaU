package MainThread;

public class Main{
    public static void main(String[] args) throws InterruptedException{//hilo principal
        /*for (int i = 0; i < 100; i++) {
            System.out.println("Este es el primer for");
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Este es el segundo for");
        }*/

        /*Thread thread = new Thread(()->{
            System.out.println("Imprimiendo mi hilo");
        });

        System.out.println("Estado del hilo es: "+thread.getState());// el estado va a ser new porque no esta el start
        thread.start();
        System.out.println("Estado del hilo es: "+thread.getState());*///ya esta runnable por el start

        /*Thread hilo = new Thread(()->{
            try {
                    System.out.println("Entro");
                    Thread.sleep(500);
                    System.out.println("Termino el segundo hilo");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        hilo.start();
        Thread.sleep(300);
        System.out.println("Durante sleep(): "+hilo.getState());*/

        Thread hilo = new Thread(()->{
            System.out.println("Entro");
        });
        hilo.start();
        hilo.join();
        System.out.println("Estado: "+hilo.getState());
        System.out.println("Termino principal");
    }
}