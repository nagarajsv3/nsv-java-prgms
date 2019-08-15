package com.nsv.jsmbaba.general;

public class ReverseAStringMain {

    public static void main(String[] args) {
        String msg = "Nagaraja";
        System.out.println("Original message="+msg);
        String revmsg1 = reverseString(msg);
        System.out.println("Reversed message="+revmsg1);
        reverseStringRecursionSolution1(msg);
        reverseStringRecursionSolution2(msg);
    }


    private static String reverseString(String msg) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = msg.length()-1; i >=0; i--) {
            stringBuffer.append(msg.charAt(i));
        }
        return stringBuffer.toString();
    }

    private static void reverseStringRecursionSolution1(String msg) {
        int lastCharPos = msg.length()-1;
        if(lastCharPos>=0) {
            char c = msg.charAt(lastCharPos);
            System.out.print(c + " \t");
            reverseStringRecursionSolution1(msg.substring(0, lastCharPos));
        }
    }

    // Not working
    private static void reverseStringRecursionSolution2(String msg) {
        System.out.println(msg);
        int lastCharPos = msg.length();
        if (lastCharPos>=1){
            reverseStringRecursionSolution2(msg.substring(1,lastCharPos));
        }
    }

}