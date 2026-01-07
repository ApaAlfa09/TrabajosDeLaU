
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ManejadorCliente implements Runnable{
    private Socket socket;

    public ManejadorCliente(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
            BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);
        ){
            String mensaje;
            while ((mensaje = lector.readLine()) != null) { 
                System.out.println("Cliente dice: "+mensaje);
                escritor.println("Servidor recibio: "+mensaje);
            }
        } catch (Exception e) {
        }
    }

}
