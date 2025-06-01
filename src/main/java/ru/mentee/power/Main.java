package ru.mentee.power;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;


public class Main {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        PalindromeChecker palindeome = new PalindromeChecker();
        if (palindeome.isPalindrome("Madam, I'm Adam")) {
            System.out.println("YES");
        }
        else{
                System.out.println("NO");
        }
    }
}