package ru.mentee.power;

public class PalindromeChecker {
    boolean isPalindrome(String str){
        str = str.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();
        String newStr= new StringBuilder(str).reverse().toString();
        System.out.println(newStr);

        if(str.equals(newStr)){
            return true;
        } else{
            return false;
        }
    }
}
