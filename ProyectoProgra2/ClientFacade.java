import java.util.List;

public class ClientFacade {
    private static ClientFacade instance;
    private ClientService clientService;
    private List<ObjectClient> clients;
    String message = "";

    private ClientFacade() {
        this.clientService = new ClientService();
        this.clients = clientService.getClients();
    }

    public static synchronized ClientFacade getInstance() {
        if (instance == null) {
            instance = new ClientFacade();
        }
        return instance;
    }

    

    public String getClientId(String username) {
        for (ObjectClient client : clients) {
            if (client.getUsername().equals(username)) {
                return client.getId();
            }
        }
        return null;

    }

    public String signIn(String username, String password) {
        message = clientService.signIn(username, password);
        return message;
    }


    public String logOut(String username) {
        String clientId = getClientId(username);
        
        message = clientService.logOut(clientId);
        return message;
    }

    public String addAccount(String username, String accountNumber) {
        String clientId = getClientId(username);

        message = clientService.addAccount(clientId, accountNumber);
        return message;
    }

    public String deposit(String username, String accountNumber, double amount) {
        String clientId = getClientId(username);

        message = clientService.deposit(clientId, accountNumber, amount);
        return message;
    }

    public String withdraw(String username, String accountNumber, double amount) {
        String clientId = getClientId(username);

        message = clientService.withdraw(clientId, accountNumber, amount);
        return message;
    }

    public String createInvestment(String username, String accountNumber, double amount) {
        String clientId = getClientId(username);


        message = clientService.createInvestment(clientId, accountNumber, amount);
        return message;
    }

    public String listAccountsAndInvestments(String username) {
        String clientId = getClientId(username);

        message = clientService.listAccountsAndInvestments(clientId);
        return message;
    }
}
