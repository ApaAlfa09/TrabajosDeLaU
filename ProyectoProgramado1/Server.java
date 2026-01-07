
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("Esperando conexion con cliente...");
        ServerSocket serverSocket = new ServerSocket(SingletonPuerto.getInstance().getPuerto());

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("El cliente se ha conecto");

            ClientHandler handler = new ClientHandler(clientSocket);
            Thread thread = new Thread(handler);
            thread.start();
        }
    }
}
