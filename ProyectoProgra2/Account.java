public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String addAmount(double amount) {
        if (amount <= 0) {
            return "El monto debe ser mayor a 0";
        } else {
            this.balance += amount;
        }
        return null;
    }

    public String subtractAmount(double amount) {
        if (amount <= 0) {
            return "El monto debe ser mayor a 0";
        } else if (this.balance < amount) {
            return "Saldo insuficiente";
        } else {
            this.balance -= amount;
        }
        return null;
    }
}