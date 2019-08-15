package com.nsv.jsmbaba.general;

public class PalindromeMain {
    public static void main(String[] args) {

        String msg = "Malayalam";

        boolean isPalindrome = isPalindrome(msg);

        System.out.println(msg + " isPalindrome="+isPalindrome);


    }

    private static boolean isPalindrome(String msg) {
        boolean palindrome = true;
        for (int i=0;i<msg.length()/2;i++){
            if (msg.toUpperCase().charAt(i) != msg.toUpperCase().charAt(msg.length()-1-i)){
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
