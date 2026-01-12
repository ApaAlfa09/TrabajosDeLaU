public class EmailService {
    private String email;

    public EmailService(String email) {
        this.email = email;
    }

    public void sendEmail(String message){
        System.out.println("Sending email: "+message);
    }
}