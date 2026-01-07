
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable tarea = () -> System.out.println("Ejecuntando "+Thread.currentThread().getName());

        executor.execute(tarea);
        executor.execute(tarea);
        executor.execute(tarea);
        executor.execute(tarea);
        executor.execute(tarea);

        executor.shutdown();
    }
}