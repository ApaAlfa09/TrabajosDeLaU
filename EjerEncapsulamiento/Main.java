import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Keypad keypad = new Keypad("pepe");
        String key = "";
        String newKey = "";

        key = JOptionPane.showInputDialog("Write the key");
        JOptionPane.showMessageDialog(null, keypad.open(key));
        key = JOptionPane.showInputDialog("Write the actal key");
        newKey = JOptionPane.showInputDialog("Write the new key");
        JOptionPane.showMessageDialog(null, keypad.changeKey(key, newKey));
    }
}
