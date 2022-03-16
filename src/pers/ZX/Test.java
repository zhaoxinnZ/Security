package pers.ZX;

import pers.ZX.util.Ciphertext;
import pers.ZX.util.TextDemo;


public class Test {


    public static void main(String[] args) {
        Ciphertext ciphertext = new Ciphertext("AB C");
        String s = new String("ABC");
        char[] characters = {'a','b','c'};
        Ciphertext ciphertext1 = new Ciphertext(characters);
        System.out.println(1 % 26);

        System.out.println(ciphertext.MessageInts);
        ciphertext.ChangeShift(1);
        System.out.println(ciphertext.MessageChars);
        System.out.println(ciphertext.MessageInts);

        TextDemo textDemo = new TextDemo("AB Z");
        System.out.println(textDemo.MessageInts);
        System.out.println(textDemo.MessageChars);
        textDemo.ChangeShift(1);
        System.out.println(textDemo.MessageInts);


    }


}
