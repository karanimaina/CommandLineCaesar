import Models.Decryption;
import Models.Encryption;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Welcome  to our text-cipher what would you like to do ?" +
                "Enter one of the following  EncryptText or DecryptMessage ");
        String navigationChoice = myScanner.nextLine();
        if (navigationChoice.equals("EncryptText")){
            String message = new String();
            int key = 0;
            System.out.print("Enter the String for Encryption:");
            message = myScanner.next();

            System.out.println("\n\nEnter Shift Key:");
            key = myScanner.nextInt();
            System.out.println(message);
            System.out.println(key);
            Encryption encryption = new Encryption(message,key);
            String cipherText1 = encryption.encrypt();
            System.out.println(cipherText1);
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

