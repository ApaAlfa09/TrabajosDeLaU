import java.util.Scanner;

public class RecuperacionCuenta {
    Scanner scanner = new Scanner(System.in);

    public void recoverEmail(){
        /* System.out.println("Write your email");
        String email = scanner.nextLine(); */
        System.out.println("Write your email to recover");
        String email = EscribirEmail.writeEmail();
        if (ValidarEmail.validateEmail(email)) {
            System.out.println("Your email was successfully recovered");
        }else{
            System.out.println("Error, your email could not be recovered");
        }
    }
}
