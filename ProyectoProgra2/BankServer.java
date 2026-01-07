import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankServer {

    public static void main(String[] args) {

        System.out.println("Esperando conexion...");
        try (
                ServerSocket serverSocket = new ServerSocket(PortSingleton.getInstance().getPort());
                ) {
            ExecutorService executorService = Executors.newCachedThreadPool();
            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("Cliente conectado");

                ClientHandler clientHandler = new ClientHandler(client);
                executorService.execute(clientHandler);

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
