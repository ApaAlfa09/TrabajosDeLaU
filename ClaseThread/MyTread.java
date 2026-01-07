package ClaseThread;

public class MyTread extends Thread{

    public MyTread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("imprimiendo el primer for");
        }
    }
}