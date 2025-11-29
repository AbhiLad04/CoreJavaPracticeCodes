package com.core_java_practise;
import java.util.Scanner;
public class LeapYearChecker {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year :- ");
        int year = sc.nextInt();
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year){
        if (year%4 == 0){
          if (year%100!=0 ){
              System.out.println(year+" is the Leap Year.");
          }else if (year%400 == 0){
              System.out.println(year+" is the Leap Year.");
          }else {
              System.out.println(year+" is Not the Leap Year.");
          }
        }
        else {
            System.out.println(year+" is Not the Leap Year.");
        }
    }
}
