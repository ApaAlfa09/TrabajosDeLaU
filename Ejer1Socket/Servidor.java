
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Servidor{
    public static void main(String[] args) throws Exception{
        System.out.println("Esperadno conexion con cliente...");
        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();//acepta el socket del cliente
        System.out.println("Conexion establecida con el cliente");

        BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);

        Random random = new Random();
        //String mensage = "";//es lo que se escribe en el cliente
        int num1 = 0;
        int num2 = 0;
        int resultadoCorrecto = 0;
        int aciertos = 0;
        
        
        for (int i = 0; i < 5; i++) {
            num1 = (random.nextInt(100)+1);
            num2 = (random.nextInt(100)+1);
            escritor.println("Digite el resultadoCorrecto de la siguiente multiplicacion "+num1+" x "+num2+" = ");
            resultadoCorrecto = num1*num2;
            int respuesta = Integer.parseInt(lector.readLine());//lee mi respuesta

            if (resultadoCorrecto == respuesta) {
                escritor.println("Su respuesta es correcta, "+num1+" x "+num2+" = "+respuesta);
                aciertos++;
            }else{
                escritor.println("Su respuesta es incorrecta, "+num1+" x "+num2+" = "+respuesta);
            }
        }
        
        escritor.println("Sus aciertos fueron: "+aciertos);
        socket.close();
        serverSocket.close();
    }
}