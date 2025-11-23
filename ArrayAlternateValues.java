package com.abhi.corejava.assignments;
import java.util.Scanner;
public class ArrayAlternateValues {

    public static void main(String[] args){

        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Elements of the Array :- ");
        for (int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("The Alternate Elements from Array are :- ");
        for (int i=0;i<array.length;i=i+2){
            System.out.println(array[i]);
        }
    }
}