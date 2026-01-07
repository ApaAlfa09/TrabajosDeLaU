package ClaseThread;

public class Main {
    public static void main(String[] args) {
        MyTread hilo1 = new MyTread();
        MyThread2 hilo2 = new MyThread2();

        hilo1.start();
        hilo2.start();  
    }
}
