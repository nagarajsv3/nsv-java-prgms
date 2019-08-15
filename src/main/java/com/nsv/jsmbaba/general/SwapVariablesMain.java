package com.nsv.jsmbaba.general;

public class SwapVariablesMain {

    public static void main(String[] args) {

        int firstVar = 24;
        int secondVar = 3;
        System.out.println("Variables before swapping firstVar="+firstVar+"; secondVar="+secondVar);
        firstVar = firstVar + secondVar;
        secondVar = firstVar - secondVar;
        firstVar = firstVar - secondVar;
        System.out.println("Variables after swapping firstVar="+firstVar+"; secondVar="+secondVar);

    }
}
