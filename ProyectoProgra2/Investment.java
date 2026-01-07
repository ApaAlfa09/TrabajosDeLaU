public class Investment {
    private String id;
    private double amount;
    private String accountNumber;
    private long creationTime;
    
    public Investment(String id, double amount, String accountNumber) {
        this.id = id;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.creationTime = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }
    
    
}
