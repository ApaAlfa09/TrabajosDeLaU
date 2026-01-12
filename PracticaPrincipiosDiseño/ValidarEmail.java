public class ValidarEmail {

    public static boolean validateEmail(String email){
        return email.contains("@") && email.contains(".");
    }
}
