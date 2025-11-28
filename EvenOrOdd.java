package com.core_java_practise;
import java.util.Scanner;
public class EvenOrOdd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int num = sc.nextInt();
        EvenOrOdd check = new EvenOrOdd();
        check.checkOddEven(num);
    }

    public void checkOddEven(int num){
        if (num%2 == 0){
            System.out.println("The Entered Number "+num+" is Even Number.");
        }
        else {
            System.out.println("The Entered Number "+num+" is Odd Number.");
        }
    }
}
