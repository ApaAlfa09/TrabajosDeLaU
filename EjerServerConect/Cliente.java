
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try(
            Socket socket = new Socket("10.126.124.1", 1234);
            Scanner teclado = new Scanner(System.in);
            BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);
        ){
            System.out.println("Conectado al servidor");
            String mensaje;
            while ((mensaje = teclado.nextLine()) != null) {
                escritor.println(mensaje);
                String respuesta = lector.readLine();
                escritor.println("Servidor recibio: "+respuesta);
            }
        } catch (Exception e) {
            System.out.println("error: "+e);
        }
    }
}
