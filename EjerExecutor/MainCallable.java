
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainCallable {
    public static void main(String[] args) throws  Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        Callable<Integer> tarea = () -> {
            return 2+3;
        };

        Future<Integer> future = executorService.submit(tarea);
        System.out.println("Resultado: "+future.get());
        //5
        executorService.shutdown();
    }
}
