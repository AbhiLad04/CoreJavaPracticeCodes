package com.core_java_practise;
import java.util.Scanner;
public class ArraySecondLargest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        System.out.println("Enter the Elements of the Array :- ");
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        secondLargest(array);
    }

    public static void secondLargest(int[] array){
        int largestElement=0;
        int secondLargest=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>largestElement){
                largestElement=array[i];
            }
        }
        for (int i=0;i<array.length;i++){
            if (array[i]>secondLargest && array[i]<largestElement){
                secondLargest=array[i];
            }
        }
        System.out.println("The Second Largest Element from the Array is :- "+secondLargest);
    }
}
