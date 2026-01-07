
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor{
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(5000);
        while (true) {//escucha multiples clientes
            Socket clienteSocket = serverSocket.accept();
            System.out.println("Cliente conectado");

            //crear un hilo por cliente
            ClienteHandler handler = new ClienteHandler(clienteSocket);
            Thread thread = new Thread(handler);
            thread.start();
        }
    }
}