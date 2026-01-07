public class WhatsappAdapter implements Messenger {
    private WhatsappAPI whatsappAPI;
    private String phoneNumber;

    public WhatsappAdapter(WhatsappAPI whatsappAPI, String phoneNumber) {
        this.whatsappAPI = whatsappAPI;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage(String msg) {
        whatsappAPI.sendMessage(phoneNumber, msg);
    }
    
}