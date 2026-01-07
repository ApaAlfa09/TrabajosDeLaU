import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main{
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Servidor "+Thread.currentThread().getName()+"activo";
        };

        Callable<String> task1 = () -> {
            Thread.sleep(1000);
            return "Servidor"+Thread.currentThread().getName()+" activo";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(1000);
            return "Servidor "+Thread.currentThread().getName()+" activo";
        };

        Future<String> future = executorService.submit(task);
        System.out.println("Resultado "+ future.get());
        future = executorService.submit(task1);
        System.out.println("Resultado "+ future.get());
        future = executorService.submit(task2);
        System.out.println("Resultado "+ future.get());

        executorService.shutdown();
    }
}