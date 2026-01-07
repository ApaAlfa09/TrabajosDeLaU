public class Consumidor extends Thread{
    private final Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.consumir();
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}