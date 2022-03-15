package pers.xinn.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StringToList {
    public ArrayList<Character> CipherList = new ArrayList<>();
    public ArrayList<Integer> CiperNums = new ArrayList<>();


    public StringToList(String plaintext) {
        for (char c:plaintext.toCharArray()){
            this.CipherList.add(c);
        }
    }

    public void println(){
        CipherList.forEach(s -> System.out.println(s));
    }

    public void printspaced(){
        CipherList.forEach(s -> System.out.printf(s+" "));
    }

    public void cipNums(){
        CiperNums.forEach(s -> System.out.println(s));
    }



}
