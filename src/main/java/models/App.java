package models;

import java.util.Scanner;
import static models.CaesarCipher.rotateEndofAlphabet;

public class App {

    public static void main(String[] args) {
        Scanner enteringword = new Scanner(System.in);
        int encryptionkey;
        String password;

        System.out.print("Enter a word or sentence: ");
        password = enteringword.nextLine();

        do {
            System.out.print("Please enter a number between 1 to 25: ");
            encryptionkey = enteringword.nextInt();

            //here we handle key errors
            if (encryptionkey < 1 || encryptionkey > 25) {
                System.out.printf(" The key must be between 1 and 25, you entered %d.\n", encryptionkey);
            }
        } while (encryptionkey < 1 || encryptionkey > 25);

        System.out.println("Password:\t" + password);
        CaesarCipher ceaserCipher = new CaesarCipher(password,encryptionkey);
        String encryption = ceaserCipher.rotateEndofAlphabet();
        System.out.println("Encrypted:\t" + encryption);

        //decryption
        CaesarCipher ceaserCipherDec = new CaesarCipher(encryption,-encryptionkey);
        System.out.println("Decrypted:\t" + ceaserCipherDec.rotateEndofAlphabet());
    }
}
