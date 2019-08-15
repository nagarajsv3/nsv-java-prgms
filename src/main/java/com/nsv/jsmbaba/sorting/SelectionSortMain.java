package com.nsv.jsmbaba.sorting;

public class SelectionSortMain {

    public static void main(String[] args) {
        int[] numbers = new int[]{4,2,8,6,10,20,14,24,18};
        printNos(numbers);
        System.out.println("\n*******Selection Sort*************");
        numbers = performSelectionSort(numbers);
        printNos(numbers);
    }

    private static void printNos(int[] numbers) {
        for (Integer number:numbers) {
            System.out.print(number+"\t");
        }
    }

    private static int[] performSelectionSort(int[] numbers) {
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    int tempNo = numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=tempNo;
                }
            }
        }
        return numbers;
    }
}
