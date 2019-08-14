package com.nsv.jsmbaba.sorting;

public class InsertionSortMain {
    public static void main(String[] args) {

        int[] numbers = new int[]{4,2,8,6,10,20,14,24,18};
        printNumbers(numbers);
        numbers = performInsertionSortSolutionUsing3ForLoops(numbers);
        System.out.println("\n*******After Insertion Sort******");
        printNumbers(numbers);

    }

    private static void printNumbers(int[] numbers) {
        for (int number: numbers) {
            System.out.print(number+"\t");
        }
    }

    private static int[] performInsertionSortSolutionUsing3ForLoops(int[] numbers) {
        int length = numbers.length;
        for (int i=1;i<length;i++){
            for (int j=0; j<=i; j++){
                if(numbers[j] > numbers[i]){
                    int noToBeInserted = numbers[i];

                    //Shift Right
                    for (int k=i;k>j;k--){
                        numbers[k] = numbers[k-1];
                    }
                    numbers[j]=noToBeInserted;
                }
            }
        }
        return numbers;
    }

    private static int[] performInsertionSortSolutionUsing2ForLoops(int[] numbers) {

        return numbers;
    }

}
