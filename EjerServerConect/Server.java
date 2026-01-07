import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Servidor escuchando");
            while (true) {
                Socket cliente = serverSocket.accept();
                System.out.println("Cliente conectado");
                new Thread(new ManejadorCliente(cliente)).start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}