import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteHandler implements Runnable{
    private Socket socket;

    public ClienteHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);
            String mensaje;
            while ((mensaje = lector.readLine()) != null) {
                System.out.println("Cliente: "+mensaje);
                escritor.println("Echo: "+mensaje);
            }
        } catch (Exception e) {
            System.out.println("Error en el cliente: "+e.getMessage());
        }
    }
    
}