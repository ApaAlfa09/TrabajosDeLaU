public class BankAcount {
    private String accountHolder;
    private double balance;

    public BankAcount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (balance >= 0) {
            balance = amount + balance;
            System.out.println("Your deposit has been made successfully");
            showBalance();
        }else{
            System.out.println("ERROR");
        }
    }

    public void withdraw(double amount){
        if (balance < amount) {
            System.out.println("The amount you want to withdraw is greater than your balance");
        }else if(balance >= amount){
            balance = balance - amount;
            System.out.println("Your withdraw has been made successfully");
            showBalance();
        }
    }

    public void showBalance(){
        System.out.println("Your account balance: " + balance);
    }
}
