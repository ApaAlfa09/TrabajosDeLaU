import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainRetNull {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        Runnable task = () -> System.out.println("Hola desde Runnable");

        Future<?> future = executorService.submit(task);
        System.out.println(future.get());//retorna null
        executorService.shutdown();
    }
}
