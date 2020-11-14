package models;

public class CaesarCipher {

    String chara;
    int numbe;

    public CaesarCipher(String chara, int numbe) {
        this.chara = chara;
        this.numbe = numbe;
    }

    public String getChara() {
        return chara;
    }

    public void setChara(String chara) {
        this.chara = chara;
    }

    public int getNumbe() {
        return numbe;
    }

    public void setNumbe(int numbe) {
        this.numbe = numbe;
    }

    public static char rotateEndofAlphabet(char y, int a) {

        final int lengthofalphabets = 26;
        //ascii has different codes according to letter so this line is checking whether letter is upper or lower case
        final char asciiShift = Character.isUpperCase(y) ? 'A' : 'a';
        final int caesarciphershift = a % lengthofalphabets;

        char shifted = (char) (y - asciiShift);
        // this line is for rotating the letter
        shifted = (char) ((shifted + caesarciphershift + lengthofalphabets) % lengthofalphabets);
        return (char) (shifted + asciiShift);
    }

    // Rotating normally
    public String rotateEndofAlphabet(){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<chara.length();i++){
            if (chara.charAt(i)==' '){
                stringBuilder.append("");
            }
            else {
                stringBuilder.append(rotateEndofAlphabet(chara.charAt(i), numbe));
            }
        }
        return stringBuilder.toString();
    }
}

