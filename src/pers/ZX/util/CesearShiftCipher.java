package pers.ZX.util;

public class CesearShiftCipher {

    public CesearShiftCipher(String Message) {
        for (int i = 25; i > 0; i--) {
            String result = cipher(Message.toLowerCase(),i);
            System.out.printf("@%2d : %s\n", 26 - i , result);
        }
    }


    public CesearShiftCipher(String Message, int ShiftValue) {
        String result = cipher(Message.toLowerCase(),ShiftValue);
        System.out.printf("@%2d : %s\n",ShiftValue ,result);
    }

    static String cipher(String msg, int shift){
        String s = "";
        int len = msg.length();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) + shift);
            if (c == ' '+shift) {
                s += ' ';
            }else if (c > 'a' &&c > 'z')
                s += (char)(msg.charAt(x) - (26 - shift));
            else
                s += (char)(msg.charAt(x) + shift);
        }
        return s;
    }
}









