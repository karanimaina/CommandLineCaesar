package Models;


public class Encryption {
    private String message;
    private int shiftKey;
    private String cipherText;

    public static final String alphabets = "abcdefghijklmnopqrstuvwxyz";


    public Encryption(String message, int shiftKey) {
        this.message = message;
        this.shiftKey = shiftKey;
        this.cipherText = "";
    }

    public String getMessage() {
        return message;
    }

    public int getShiftKey() {
        return shiftKey;
    }
    public String encrypt(){
        message= message.toLowerCase();
        cipherText = "";
        for (int i = 0; i < message.length(); i++) {
            int charPosition = alphabets.indexOf(message.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alphabets.charAt(keyVal);
            cipherText += replaceVal;
        }
        return  cipherText;

    }
}

