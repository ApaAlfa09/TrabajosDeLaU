public class EmailSender implements Messenger{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Email sent: "+msg);
    }
    
    
}