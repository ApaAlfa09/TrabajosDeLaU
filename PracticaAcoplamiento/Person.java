public class Person {
    private String name;
    private String email;
    private EmailService emailService;

    public Person(String name, EmailService emailService){
        this.name = name;
        this.emailService = emailService;
    }

    /* public Person(String name){
        this.name = name;
        this.emailService = new EmailService();
    } */

    public void notifyPerson(){
        emailService.sendEmail("Hello, my name is "+name);
    }
}
