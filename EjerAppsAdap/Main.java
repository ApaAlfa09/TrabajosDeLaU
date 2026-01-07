public class Main {
    public static void main(String[] args) {
        Messenger smsSender = new SMSSender();
        Messenger emailSender = new EmailSender();
        WhatsappAPI whatsappAPI = new WhatsappAPI();
        
        smsSender.sendMessage("Hello via SMS!");
        emailSender.sendMessage("Hello via Email!");
        
        Messenger whatsappAdapter = new WhatsappAdapter(whatsappAPI, "1234567890");
        
        whatsappAdapter.sendMessage("Hello via WhatsApp!");
        
    }
}