
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) throws Exception{

        System.out.println("Esperando cliente");
        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();
        System.out.println("Conexion establecida");

        //InputStream entrada = socket.getInputStream();
        //OutputStream salida = socket.getOutputStream();

        BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);

        //String mensage = lector.readLine();
        //System.out.println(mensage);

        String mensage;
        while ((mensage = lector.readLine()) !=null) {
            System.out.println("Cliente dice: "+mensage);
            if (mensage.equalsIgnoreCase("Salir")) {
                break;//salir del bucle si el usuario escribe "salir"
            }
            escritor.println("Eco: "+mensage);
        }

        socket.close();
        serverSocket.close();
    }
}