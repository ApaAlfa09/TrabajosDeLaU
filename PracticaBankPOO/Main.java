public class Main {
    public static void main(String[] args) {
        BankAcount bankacount = new BankAcount("Josue", 200000);
        BankApp appbank = new BankApp(bankacount);

        appbank.starApp();
    }
}
