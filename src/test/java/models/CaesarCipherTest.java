package models;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CaesarCipherTest{

    @Test
    public void newCaesarCipher_instantiatesCorrectly()  {
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }

    //Testing at the end of alphabets how it rotates

    @Test
    public void newCaesarCipher_rotateafterendofalphabets()  {
        char input='y';
        char output='d';
        assertEquals(output,CaesarCipher.RotateEndofAlphabet(input, 5));
    }

}