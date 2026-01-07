
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter escritor = new PrintWriter(socket.getOutputStream());
            String message;
            while ((message = lector.readLine()) != null) {
                System.out.println("Cliente: "+message);
                escritor.println("Echo: "+message);
            }
        } catch (Exception e) {
            System.out.println("Error en cliente: "+e.getMessage());
        }
        
    }

}
