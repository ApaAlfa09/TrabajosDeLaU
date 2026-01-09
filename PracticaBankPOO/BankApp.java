
import java.util.Scanner;

public class BankApp {
    Scanner scanner = new Scanner(System.in);
    private BankAcount bankAcount;

    public BankApp(BankAcount bankAcount) {
        this.bankAcount = bankAcount;
    }

    public void starApp(){
        boolean conti = true;
        int option = 0;
        double amount = 0.0;

        do { 
            System.out.println("What transaction do you want to carry out? \n"
                                +"1. Deposit money\n"
                                +"2. Withdraw money\n"
                                +"3. Show balance\n"
                                +"4. Go out\n");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount you want to deposit");
                    amount = scanner.nextDouble();
                    bankAcount.deposit(amount);
                break;

                case 2:
                    System.out.println("Enter the amount you want to whitdraw");
                    amount = scanner.nextDouble();
                    bankAcount.withdraw(amount);
                break;

                case 3:
                    bankAcount.showBalance();
                break;

                case 4:
                    System.out.println("Leaving the system...");
                    conti = false;
                break;

                default:
                    System.out.println("ERROR, invalid option");
            }
        } while (conti);
    }
}
