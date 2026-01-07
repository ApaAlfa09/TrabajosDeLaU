public class SMSSender implements Messenger{

    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS sent: "+msg);
    }
    
}
