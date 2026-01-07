import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", PortSingleton.getInstance().getPort());
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                Scanner scanner = new Scanner(System.in)) {

            signIn(in, out, scanner);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void signIn(BufferedReader in, PrintWriter out, Scanner scanner) {
        try {

            String mensaje = in.readLine();
            System.out.println(mensaje);
            mensaje = in.readLine();
            System.out.println(mensaje);
            String username = scanner.nextLine();
            out.println(username);
            mensaje = in.readLine();
            System.out.println(mensaje);
            String password = scanner.nextLine();
            out.println(password);
            mensaje = in.readLine();
            System.out.println(mensaje);

            if (mensaje.equals("Sesión iniciada correctamente")) {
                showMenu(in, out, scanner);
            }else {
                mensaje = in.readLine();
                System.out.println(mensaje);
            }

        } catch (Exception e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
        }

    }

    public static void showMenu(BufferedReader in, PrintWriter out, Scanner scanner) {
        try {
            String option = "";
            String message = "";
            String accountNumber = "";
            String answer = "";
            double amount = 0.0;
            boolean running = true;

            while (running) {

                while ((message = in.readLine()) != null) {
                    System.out.println(message);
                    if (message.equals("Seleccione una opción:")) {
                        break;
                    }
                }

                option = scanner.nextLine();
                out.println(option);
                System.out.println();

                switch (option) {
                    case "1":
                        message = in.readLine();
                        System.out.println(message);
                        accountNumber = scanner.nextLine();
                        out.println(accountNumber);
                        answer = in.readLine();
                        System.out.println(answer);

                        break;
                    case "2":
                        message = in.readLine();
                        System.out.println(message);
                        accountNumber = scanner.nextLine();
                        out.println(accountNumber);
                        message = in.readLine();
                        System.out.println(message);
                        amount = Double.parseDouble(scanner.nextLine());
                        out.println(amount);
                        answer = in.readLine();
                        System.out.println(answer);

                        break;
                    case "3":
                        message = in.readLine();
                        System.out.println(message);
                        accountNumber = scanner.nextLine();
                        out.println(accountNumber);
                        message = in.readLine();
                        System.out.println(message);
                        amount = Double.parseDouble(scanner.nextLine());
                        out.println(amount);
                        answer = in.readLine();
                        System.out.println(answer);

                        break;
                    case "4":
                        message = in.readLine();
                        System.out.println(message);
                        accountNumber = scanner.nextLine();
                        out.println(accountNumber);
                        message = in.readLine();
                        System.out.println(message);
                        amount = Double.parseDouble(scanner.nextLine());
                        out.println(amount);
                        answer = in.readLine();
                        System.out.println(answer);

                        break;
                    case "5":
                        while ((message = in.readLine()) != null) {
                            if (message.equals("")) {
                                break;
                            }
                            System.out.println(message);
                        }

                        break;
                    case "6":
                        message = in.readLine();
                        System.out.println(message);
                        running = false;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }

            }
        } catch (Exception e) {
            System.out.println("Error en el menú: " + e.getMessage());
        }
    }

}