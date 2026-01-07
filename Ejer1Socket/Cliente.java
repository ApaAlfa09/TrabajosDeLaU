import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente{
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 5000);
        OutputStream salida = socket.getOutputStream();
        PrintWriter escritor = new PrintWriter(salida, true);
        InputStream entrada = socket.getInputStream();
        BufferedReader lector = new BufferedReader(new InputStreamReader(entrada));

        Scanner teclado = new Scanner(System.in);
        String mensage;
        while ((mensage = lector.readLine()) != null) {//encargado de leer la multiplicacion
            System.out.println(mensage);//aqui muestra la pregunta en la taerminal
            String respueta = teclado.nextLine();//es donde escribo la respuesta segun yo
            escritor.println(respueta);//encargado de enviar lo que respondi a el servidor
            String respuestas = lector.readLine();//lee si es correcta o no
            System.out.println(respuestas);//aqui lo imprime

        }

        String correctas = lector.readLine();
        System.out.println("Respuestas correctas: "+correctas);

        teclado.close();
        socket.close();
    }
}