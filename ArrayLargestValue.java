package com.core_java_practise;
import java.util.Scanner;
public class ArrayLargestValue {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of the Array :- ");
        int[] array = new int[5];
        for (int i=0;i<5;i++){
            array[i] = sc.nextInt();
        }
        largestValue(array);
    }

    public static void largestValue(int[] array){
        for (int i=1;i<5;i++){
            if (array[0]<array[i]){
                array[0] = array[i];
            }
        }
        System.out.printf("The Largest Value from the Array is :- %d",array[0]);
    }
}
