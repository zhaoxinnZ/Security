package pers.ZX.util;

import org.jetbrains.annotations.NotNull;
import pers.ZX.Interfaces.Cryptor;


public class Ciphertext extends TextDemo implements Cryptor{


    public Ciphertext(@NotNull String plaintext) {
        super(plaintext);
    }

    public Ciphertext(@NotNull Character[] characters) {
        super(characters);
    }

    public Ciphertext(char[] charlist) {
        super(charlist);
    }

    @Override
    public void Cesear() {
    }

    @Override
    public String Monoalphabetic() {
        return null;
    }

    @Override
    public String PlayFair() {
        return null;
    }

    @Override
    public String Vigenere() {
        return null;
    }

    @Override
    public String Polyalphabetic() {
        return null;
    }

    @Override
    public String Autokey() {
        return null;
    }

    @Override
    public String Vernam() {
        return null;
    }

    @Override
    public String Railfence() {
        return null;
    }

    @Override
    public String Transposition() {
        return null;
    }

    @Override
    public String Product() {
        return null;
    }
}
