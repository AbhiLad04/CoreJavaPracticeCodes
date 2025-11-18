package com.core_java_practise;
import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to get it's Factorial :- ");
        int num = sc.nextInt();
        FactorialUsingRecursion one = new FactorialUsingRecursion();
        System.out.println("The Factorial of the number "+num+" is :- "+one.factorialRec(num));
    }

    public int factorialRec(int num){

        if (num==1){
            return 1;
        }
        return num*factorialRec(num-1);
    }
}
