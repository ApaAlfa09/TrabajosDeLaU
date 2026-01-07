import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;
    private ClientFacade clientFacade;
    private boolean isRunning = true;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        this.clientFacade = ClientFacade.getInstance();

    }

    @Override
    public void run() {
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);) {

            out.println("Bienvenido al banco");
            out.println("Ingrese su usuario:");
            String username = in.readLine();
            out.println("Ingrese su contraseña:");
            String password = in.readLine();

            String message = clientFacade.signIn(username, password);
            out.println(message);

            if (message.equals("Sesión iniciada correctamente")) {
                while (isRunning) {
                    showMenu(in, out, username);
                }
            } else {
                out.println("Cerrando conexión...");
                socket.close();
            }

        } catch (Exception e) {
            System.out.println("Error en el cliente: " + e.getMessage());
        }
    }

    private void showMenu(BufferedReader in, PrintWriter out, String username) {
        try {
            out.println("\nMENU");
            out.println("1. Agregar cuenta bancaria");
            out.println("2. Depositar");
            out.println("3. Retirar");
            out.println("4. Invertir");
            out.println("5. Listar cuentas e inversiones");
            out.println("6. Cerrar sesión");
            out.println("Seleccione una opción:");
            String option = in.readLine();

            switch (option) {
                case "1":
                    handleAddAccount(in, out, username);
                    break;
                case "2":
                    handleDeposit(in, out, username);
                    break;
                case "3":
                    handleWithdraw(in, out, username);
                    break;
                case "4":
                    handleCreateInvestment(in, out, username);
                    break;
                case "5":
                    handleListAccountsAndInvestments(in, out, username);
                    break;
                case "6":
                    handleLogout(in, out, username);
                    break;
                default:
                    out.println("Opción no válida");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleAddAccount(BufferedReader in, PrintWriter out, String username) {
        try {
            out.println("Ingrese el número de cuenta:");
            String accountNumber = in.readLine();

            String answer = clientFacade.addAccount(username, accountNumber);
            out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleDeposit(BufferedReader in, PrintWriter out, String username) {
        try {
            out.println("Ingrese el número de cuenta:");
            String accountNumber = in.readLine();
            out.println("Ingrese el monto a depositar:");
            double amount = Double.parseDouble(in.readLine());

            if (amount <= 0) {
                out.println("El monto debe ser mayor a 0");
                return;
            }

            String answer = clientFacade.deposit(username, accountNumber, amount);
            out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleWithdraw(BufferedReader in, PrintWriter out, String username) {
        try {
            out.println("Ingrese el número de cuenta:");
            String accountNumber = in.readLine();
            out.println("Ingrese el monto a retirar:");
            double amount = Double.parseDouble(in.readLine());

            if (amount <= 0) {
                out.println("El monto debe ser mayor a 0");
                return;
            }
            String answer = clientFacade.withdraw(username, accountNumber, amount);
            out.println(answer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleCreateInvestment(BufferedReader in, PrintWriter out, String username) {
        try {
            out.println("Ingrese el número de cuenta:");
            String accountNumber = in.readLine();
            out.println("Ingrese el monto a invertir:");
            double amount = Double.parseDouble(in.readLine());

            if (amount <= 0) {
                out.println("El monto debe ser mayor a 0.");
                return;
            }
            String answer = clientFacade.createInvestment(username, accountNumber, amount);
            out.println(answer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleListAccountsAndInvestments(BufferedReader in, PrintWriter out, String username) {
        String info = clientFacade.listAccountsAndInvestments(username);
        out.println(info);
    }

    private void handleLogout(BufferedReader in, PrintWriter out, String username) {
        String message = clientFacade.logOut(username);
        out.println(message);
        isRunning = false;
    }

}
