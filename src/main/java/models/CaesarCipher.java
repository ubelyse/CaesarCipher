package models;

public class CaesarCipher {

    String chara;
    int numbe;

    public CaesarCipher(String chara,int numbe) {
            this.chara=chara;
            this.numbe=numbe;
    }

    public static char RotateEndofAlphabet(char y,int a){

        final int lengthofalphabets = 26;
        final char lettershift = Character.isUpperCase(y) ? 'A' : 'a';
        final int caesarciphershift = a % lengthofalphabets;


        char shifted = (char) (y - lettershift);
        shifted = (char) ((shifted + caesarciphershift + lengthofalphabets) % lengthofalphabets);
        return (char) (shifted + lettershift);
    }

}

