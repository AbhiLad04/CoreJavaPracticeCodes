package com.core_java_practise;
import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number/Index until which you want to print the Fibonacci Series :- ");
        int num = sc.nextInt();
        printFibonacciSeries(num);
    }

    static void printFibonacciSeries(int num){
        int no1=0,no2=1;
         System.out.print(no1+" "+no2);
        for (int i=2;i<num;i++) {
            int next = no1+no2;
            System.out.print(" "+next);
//          System.out.print(no1+no2);
            no1 = no2;
            no2 = next;
        }
    }
}
