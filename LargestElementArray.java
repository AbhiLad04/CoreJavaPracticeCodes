package com.core_java_practise;
import java.util.Scanner;
public class LargestElementArray {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int [] array = new int [5];
        System.out.print("Enter the values of Array :- ");
        for (int i=0;i<5;i++){
            array[i] = sc.nextInt();
        }
        largestFromArray(array);
    }

    public static void largestFromArray(int[] arr){

        int largestNum=0;
        for (int i=0;i<arr.length;i++){

            if (arr[i]>largestNum){
                largestNum=arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println("The Largest Element/Value from the Array is :- "+largestNum);
    }
}
