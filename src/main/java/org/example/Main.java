package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.printf("Type %d element (as int):", i);
            array[i] = in.nextInt();
        }
        int sum = 0;
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
            sum += j;
        }
        double average = (double) sum / array.length;
        double result = min + average;
        System.out.println(result);
    }
}