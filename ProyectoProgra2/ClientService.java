import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.MINUTES;

public class ClientService {

    private List<ObjectClient> clients;
    private final List<Session> activeSessions;
    private final ScheduledExecutorService executor;
    private int sessionId;

    public ClientService() {
        this.clients = new ArrayList<>();
        this.activeSessions = new ArrayList<>();
        this.executor = Executors.newScheduledThreadPool(1);
        this.sessionId = 1;
        addClients();
    }

    public List<ObjectClient> getClients() {
        return clients;
    }

    public List<Session> getActiveSessions() {
        return activeSessions;
    }

    private void addClients() {
        ObjectClient client1 = new ObjectClient("1", "user1", "123");
        ObjectClient client2 = new ObjectClient("2", "user2", "456");
        ObjectClient client3 = new ObjectClient("3", "user3", "789");
        ObjectClient client4 = new ObjectClient("4", "user4", "012");

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);

    }

    public String signIn(String username, String password) {
        ObjectClient client = clients.stream()
                .filter(c -> c.getUsername().equals(username) && c.getPassword().equals(password))
                .findFirst()
                .orElse(null);

        boolean alreadyLoggedIn = activeSessions.stream()
                .anyMatch(session -> session.getClientId().equals(client.getId()) && session.isActive());

        if (alreadyLoggedIn) {
            return "El usuario ya tiene una sesión activa";
        }

        client.setIdSession(sessionId);
        sessionId++;
        activeSessions.add(new Session(client.getIdSession(), client.getId()));
        return "Sesión iniciada correctamente";

    }

    public ObjectClient getClient(String username) {
        return clients.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public ObjectClient getClientById(String id) {
        return clients.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public String addAccount(String id, String accountNumber) {
        ObjectClient client = getClientById(id);

        boolean accountExists = client.getAccounts().stream()
                .anyMatch(account -> account.getAccountNumber().equals(accountNumber));

        if (accountExists) {
            return "La cuenta ya existe";
        }

        Account account = new Account(accountNumber);
        client.getAccounts().add(account);
        return "Cuenta " + account.getAccountNumber() + " agregada correctamente";

    }

    public String deposit(String id, String accountNumber, double amount) {

        ObjectClient client = getClientById(id);

        Account account = client.getAccounts().stream()
                .filter(acc -> acc.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);

        if (account == null) {
            return "Cuenta no encontrada";
        }

        String answer = account.addAmount(amount);
        if (answer != null) {
            return answer;
        }else {
            return "Deposito realizado correctamente, Su saldo es: " + account.getBalance();
        }
    }

    public String withdraw(String id, String accountNumber, double amount) {

        ObjectClient client = getClientById(id);

        Account account = client.getAccounts().stream()
                .filter(acc -> acc.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);

        if (account == null) {
            return "Cuenta no encontrada";
        }

        if (account.getBalance() < amount) {
            return "Saldo insuficiente";
        }

        String answer = account.subtractAmount(amount);
        if (answer != null) {
            return answer;
        } else {
            return "Retiro realizado correctamente, Su saldo es: " + account.getBalance();
        }
    }

    public String createInvestment(String id, String accountNumber, double amount) {
        ObjectClient client = getClientById(id);

        if (amount <= 0) {
            return "El monto debe ser mayor a 0";
        }

        Account account = client.getAccounts().stream()
                .filter(acc -> acc.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);

        if (account == null) {
            return "Cuenta no encontrada";
        }

        if (account.getBalance() < amount) {
            return "Saldo insuficiente";
        }

        account.subtractAmount(amount);

        int idInvestment = (int) (Math.random() * 1000) + 1;
        String investmentId = String.valueOf(idInvestment);
        Investment investment = new Investment(investmentId, amount, accountNumber);
        client.getInvestments().add(investment);

        executor.schedule(() -> completeInvestment(id, investmentId), 1, MINUTES);
        return "Inversion creada correctamente con ID: " + investmentId;
    }

    private void completeInvestment(String clientId, String investmentId) {
        ObjectClient client = getClientById(clientId);

        Investment investment = client.getInvestments().stream()
                .filter(inv -> inv.getId().equals(investmentId))
                .findFirst()
                .orElse(null);

        double profit = investment.getAmount() + investment.getAmount() * 1.1;
        double totalReturn = investment.getAmount() + profit;

        deposit(clientId, investment.getAccountNumber(), totalReturn);

        client.getInvestments().remove(investment);
    }

    public String listAccountsAndInvestments(String clientId) {
        ObjectClient client = getClientById(clientId);

        String information = "Cuentas Bancarias: \n";

        if (client.getAccounts().isEmpty()) {
            information += "No hay cuentas registradas \n";
        } else {
            for (Account account : client.getAccounts()) {
                information += "Numero de cuenta: " + account.getAccountNumber() + "\n";
                information += "Saldo: " + account.getBalance() + "\n";
            }
        }

        information += "Inversiones: \n";
        if (client.getInvestments().isEmpty()) {
            return information += "No hay inversiones registradas \n";
        } else {
            for (Investment investment : client.getInvestments()) {
                information += "Numero de cuenta: " + investment.getAccountNumber() + "\n";
                information += "ID de inversion: " + investment.getId() + "\n";
                information += "Monto: " + investment.getAmount() + "\n";
            }
        }
        information += "";

        return information;
    }

    public String logOut(String clientId) {
        ObjectClient client = getClientById(clientId);
        
        boolean alreadyLoggedIn = activeSessions.stream()
                .anyMatch(session -> session.getClientId().equals(client.getId()) && session.isActive());

        if (!alreadyLoggedIn) {
            return "El usuario no tiene una sesión activa.";
        }

        activeSessions.removeIf(session -> session.getSessionId() == client.getIdSession() && session.isActive());
        return "Cerrando conexión...";
    }

}
