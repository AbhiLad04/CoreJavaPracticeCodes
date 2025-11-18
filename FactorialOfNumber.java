package com.core_java_practise;
import java.util.Scanner;
public class FactorialOfNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num to get its Factorial :- ");
        int num = sc.nextInt();
        System.out.println("The Factorial of num "+num+" is :- "+calculateFactorial(num));
    }

    static int calculateFactorial(int num){

    int fact = 1;
    for (int i=2;i<=num;i++){
        fact = fact*i;
    }
    return fact;
    }

}
