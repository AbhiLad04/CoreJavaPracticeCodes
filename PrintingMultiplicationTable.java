package com.core_java_practise;
import java.util.Scanner;
public class PrintingMultiplicationTable {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to Print it's Multiplication Table :- ");
        int num = sc.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num){
        System.out.println("The Multiplication Table of "+num+" is :- ");
        for (int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
