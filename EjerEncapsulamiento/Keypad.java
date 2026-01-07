public class Keypad {
    private String key;

    public Keypad(String key) {
        this.key = key;
    }

    public boolean open(String key){
        if(key.equals(this.key)){
            return true;
        }else{
            return false;
        }
    }

    public String changeKey(String currentKey, String newKey){
        if (currentKey.equals(this.key)) {
            this.key = newKey;
            return "The key succesfully changes";
        }else{
            return "The key isnt the same";
        }
    }

}