package ClaseThread;

public class MyThread2 extends Thread{

    public MyThread2() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("imprimiendo el segundo for");
        }
    }
    
    

}
