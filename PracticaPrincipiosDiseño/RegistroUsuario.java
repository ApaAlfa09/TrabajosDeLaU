public class RegistroUsuario {

    public void register(){
        /* System.out.println("Write your email");
        String email = scanner.nextLine(); */
        System.out.println("Write your email to register");
        String email = EscribirEmail.writeEmail();
        if (ValidarEmail.validateEmail(email))  {
            System.out.println("Your email was successfully registered");
        }else{
            System.out.println("Error, your email could not be registered");
        }
    }
}
