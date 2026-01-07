
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws  Exception{
        
        Socket socket = new Socket("localhost", 5000);

        OutputStream salida = socket.getOutputStream();
        PrintWriter escritor = new PrintWriter(salida, true);

        InputStream entrada = socket.getInputStream();
        BufferedReader lector = new BufferedReader(new InputStreamReader(entrada));

        Scanner teclado = new Scanner(System.in);
        String mensage;
        escritor.println("Hola servidor");
        System.out.println("Escribe un mensaje");
        while ((mensage = teclado.nextLine()) != null) {
            escritor.println(mensage);//pasa el mensaje
            if (mensage.equalsIgnoreCase("salir")) {
                break;
            }
            String respuetsa = lector.readLine();
            System.out.println("Servidor responde "+respuetsa);
        }

        teclado.close();
        socket.close();
    }
}
