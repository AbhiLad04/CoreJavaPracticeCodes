package com.abhi.corejava.assignments;
import java.util.Scanner;
public class ArrayMidelement {

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Array of numbers :- ");
    int[] numArr = new int[11];
    for (int i=0;i<numArr.length;i++){
      numArr[i] = sc.nextInt();
    }

    System.out.println("Finding the Mid Element from the Array.");
    for (int i=0;i<numArr.length;i++){
        if (i== numArr.length/2){
            System.out.println("This is The Mid Element from the Array :- "+numArr[i]+", With its Index :- "+i);
        }
    }
}
}