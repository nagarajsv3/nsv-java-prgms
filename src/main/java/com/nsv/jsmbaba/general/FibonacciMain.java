package com.nsv.jsmbaba.general;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMain {

    // 1 1 2 3 5 8 13 21 34

    public static Map<Integer, Integer> fibonacciNumbers = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        int number=43;

        Instant startTime = Instant.now();
        int fibonacci = fibonacciUsingReccursion(number);
        Instant endTime = Instant.now();
        System.out.println("fibonacci of number="+number+" is "+fibonacci);
        System.out.println("Time Taken to compute is = "+ Duration.between(endTime,startTime));
        System.out.println("***********************************************");

        startTime = Instant.now();
        fibonacciUsingReccursionWithMap(number);
        endTime = Instant.now();
        System.out.println("fibonacci of number="+number+" is "+fibonacci);
        System.out.println("Time Taken to compute is = "+Duration.between(endTime,startTime));
    }

    private static int fibonacciUsingReccursion(int x) {

        if (x<=0){
            return 1;
        }
        int number =  fibonacciUsingReccursion(x-1)+fibonacciUsingReccursion(x-2);
        return number;
    }

    private static int fibonacciUsingReccursionWithMap(int x) {
        if (x<=0){
            return 1;
        }
        if(fibonacciNumbers.containsKey(x)){
            return fibonacciNumbers.get(x);
        }

        int number =  fibonacciUsingReccursion(x-1)+fibonacciUsingReccursion(x-2);

        fibonacciNumbers.put(x,number);
        return number;
    }
}
