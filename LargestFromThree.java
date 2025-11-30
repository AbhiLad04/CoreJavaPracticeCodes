package com.core_java_practise;
import java.util.Scanner;
public class LargestFromThree {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number A :- ");
        int a = sc.nextInt();
        System.out.print("Enter the Number B :- ");
        int b = sc.nextInt();
        System.out.print("Enter the Number C :- ");
        int c = sc.nextInt();
        findLargestFromThree(a,b,c);
    }

    public static void findLargestFromThree(int a,int b,int c){
        if (a>b){
            if (a>c){
                System.out.println(a+" is the Largest Number from A,B,C.");
            }else {
                System.out.println(c+" is the Largest Number from A,B,C.");
            }
        }else {
            if (b>c){
                System.out.println(b+" is the Largest Number from A,B,C.");
            }else {
                System.out.println(c+" is the Largest Number from A,B,C.");
            }
        }
    }
}
