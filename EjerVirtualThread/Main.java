
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{
    public static void main(String[] args){
        //Thread t = Thread.ofVirtual().start(() -> {
        //    System.out.println("Soy un hilo virtual");
        //}); 

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        executor.submit(() -> {
            System.out.println("Hola");
        });
    }
}