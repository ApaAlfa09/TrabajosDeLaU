import java.util.*;

public class ObjectClient {
    private String id;
    private String username;
    private String password;
    private List<Account> accounts;
    private List<Investment> investments;
    private int idSession;
    
    public ObjectClient(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.accounts = new ArrayList<>();
        this.investments = new ArrayList<>();
        this.idSession = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }
    
}