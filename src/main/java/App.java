import Models.Decryption;
import Models.Encryption;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Hello , do you want to hide content meaning from other users ,do you always feel unsafe about your content getting in the wrong hands, worry no more, cipher limited encrypts your message in a way that is only meaningful to you alone "+
                "Enter your message and choose  encryption, then enter the shift key, to encrypt the message."+"" +
                "to decrypt copy  the encrypted message and inputed the key that was used to encrypt, you get your message back");

        System.out.println(" kindly select one of the following ?" +
                "Enter one of the following  EncryptText or DecryptMessage ");


        String navigationChoice = myScanner.nextLine();
        if (navigationChoice.equals("EncryptText")){
            String message = new String();
            int key = 0;
            System.out.print("Enter the String for Encryption:");
            message = myScanner.next();

            System.out.println("\n\nEnter Shift Key:");
            key = myScanner.nextInt();
            Encryption encryption = new Encryption(message,key);
            String cipherText1 = encryption.encrypt();
            System.out.println(cipherText1);
            System.out.println("*************************************");
        }else if (navigationChoice.equals("DecryptMessage")){
            String StringMessage = new String();
            int ShiftKey = 0;
            System.out.print("Enter the String for Decryption:");
            StringMessage = myScanner.nextLine();

            System.out.println("\n\nEnter Shift Key:");
            ShiftKey = myScanner.nextInt();
            myScanner.nextLine();
            Decryption decryption = new Decryption(StringMessage,ShiftKey);
            System.out.println("\nDecrypted Message:" + decryption.decrypt());

        }}}

