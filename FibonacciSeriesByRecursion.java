package com.core_java_practise;
import java.util.Scanner;
public class FibonacciSeriesByRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number/Index until Which you want to print the Fibonacci Series :- ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++){
        System.out.print(fibonacciSeries(i)+" ");
        }
    }

    static int fibonacciSeries(int num){
        if (num <= 1){
            return num;
        }
        return fibonacciSeries(num-1)+fibonacciSeries(num-2);
    }
}
