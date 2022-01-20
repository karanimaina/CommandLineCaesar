package Models;

public class Decryption {
    private String decryptMessage;
    private int shiftKey;
    private String StringMessage;

    public static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";

    public Decryption(String decryptText, int shiftKey) {
        this.decryptMessage = decryptText;
        this.shiftKey = shiftKey;
        this.StringMessage = "";
    }

    public String getDecryptMessage() {
        return decryptMessage;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public String getStringMessage() {
        return StringMessage;
    }

    public String decrypt(){
        decryptMessage =decryptMessage.toLowerCase();
        StringMessage = "";
        for (int i = 0; i < decryptMessage.length(); i++) {
            int charPosition = ALPHABETS.indexOf(decryptMessage.charAt(i));
            int keyVal = ( charPosition- shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = ALPHABETS.length() + keyVal;
            }
            char replaceVal = ALPHABETS.charAt(keyVal);
            StringMessage += replaceVal;
        }
        return  StringMessage;

    }
}


