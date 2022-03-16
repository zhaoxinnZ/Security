package pers.ZX.util;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TextDemo {
    public ArrayList<Character> MessageChars = new ArrayList<>();
    public ArrayList<Integer> MessageInts = new ArrayList<>();
    public String CurrentMessage;
    private int Shift = 0;

    public TextDemo(@NotNull String Plaintext) {
        this.CurrentMessage = Plaintext;
        this.MessageChars = new Converter().asChar(Plaintext);
        this.MessageInts = new Converter().asInt(Plaintext, Shift);
    }

    public TextDemo(@NotNull Character[] CharacterList) {
        this.MessageInts = new Converter().asInt(CharacterList, Shift);
        this.CurrentMessage = CharacterList.toString();
        this.MessageChars = new Converter().asChar(CharacterList);
    }

    public TextDemo(@NotNull char[] charList) {
        this.MessageInts = new  Converter().asInt(charList, Shift);
        this.CurrentMessage = charList.toString();
        this.MessageChars = new Converter().asChar(charList);
    }

    public void Cesear() {
    }

    public void ChangeShift(int i) {
        this.Shift = i;
        refresh();
    }

    public void refresh(){
        this.MessageInts = new Converter().asInt(CurrentMessage,Shift);
    }

}



