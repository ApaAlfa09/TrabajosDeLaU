
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",5000);
        BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Conectando al servidor");

        String mensaje;
        while (!(mensaje = lector.readLine()).equalsIgnoreCase(mensaje)) {
            escritor.println(mensaje);
            System.out.println("Servidor dice "+lector.readLine());
        }
    }
}
