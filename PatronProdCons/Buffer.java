import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int CAPASIDAD = 5;

    public synchronized void producuir(int valor) throws InterruptedException{
        while (queue.size() == CAPASIDAD) {
            wait();
        }
        queue.add(valor);
        System.out.println("El productor produjo un "+valor);
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException{
        while (queue.isEmpty()) {
            wait();
        }
        int valor = queue.poll();
        System.out.println("El consumidor consumio "+valor);
        notifyAll();
        return valor;
    }
}
