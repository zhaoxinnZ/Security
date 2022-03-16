package pers.ZX.util;


import java.util.ArrayList;

public class Converter {

     public int Shift(Character character, Integer ShiftValue) {
        int LowerCasedCharacter = Character.toLowerCase(character);
        int ShiftedValue = 0;
        if (LowerCasedCharacter >= 97 && character <= 122) {

            final int DefaultShift = 97;
            int ModdedShift = ShiftValue % 26;
            int ModdedCharacter = Character.toLowerCase(character) + ModdedShift;


            if (ModdedCharacter >= 97 && character <= 122) {
                ShiftedValue = ModdedShift;
            }
        }
        return ShiftedValue;
    }


    public ArrayList<Integer> asInt(Object Plaintext) {
        ArrayList<Integer> IntArrayList = new ArrayList<>();

        if (Plaintext instanceof String) {
            for (int i : ((String) Plaintext).toLowerCase().toCharArray()) {

                if (i != 32) {
                    IntArrayList.add(i);
                } else {
                    IntArrayList.add(null);
                }
            }
        } else if (Plaintext instanceof Character[]) {
            for (int i : ((Character[]) Plaintext)) {
                if (i != 32) {
                    IntArrayList.add(i);
                } else {
                    IntArrayList.add(null);
                }
            }
        } else if (Plaintext instanceof char[]) {
            for (int i : ((char[]) Plaintext)) {
                if (i != 32) {
                    IntArrayList.add(i);
                } else {
                    IntArrayList.add(null);
                }
            }
        }
        return IntArrayList;
    }

    public ArrayList<Integer> asInt(Object Plaintext, Integer ShiftValue) {
        ArrayList<Integer> IntArrayList = new ArrayList<>();
        if (Plaintext instanceof String) {

            System.out.println(((String) Plaintext).toLowerCase().toCharArray());

            for (Character i : ((String) Plaintext).toLowerCase().toCharArray()) {
                System.out.println(i);
                IntArrayList.add(Shift(i, ShiftValue));
            }
        } else if (Plaintext instanceof Character[]) {
            for (char i : ((Character[]) Plaintext)) {
                IntArrayList.add(Shift(i, ShiftValue));
            }
        } else if (Plaintext instanceof char[]) {
            for (char i : ((char[]) Plaintext)) {
                IntArrayList.add(Shift(i, ShiftValue));
            }
        }
        return IntArrayList;
    }

    public ArrayList<Character> asChar(Object Plaintext) {
        ArrayList<Character> CharList = new ArrayList<>();
        if (Plaintext instanceof String) {
            for (char c : ((String) Plaintext).toCharArray()) {
                CharList.add(c);
            }
        } else if (Plaintext instanceof char[]) {
            for (char c : (char[]) Plaintext) {
                CharList.add(c);
            }
        }
        return CharList;
    }
}
