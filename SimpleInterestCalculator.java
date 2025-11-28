package com.core_java_practise;
import java.util.Scanner;
public class SimpleInterestCalculator {

    public static void main(String[] abhi){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wel-Come to Simple Interest Calculator.");
        System.out.print("Enter the Principal Amount :- ");
        double principalAmount = sc.nextDouble();
        System.out.print("Enter the Annual Interest Rate in % :- ");
        float interestRate = sc.nextFloat();
        System.out.print("Enter the Time Period in Years :- ");
        short timePeriod = sc.nextShort();
        calculateSimpleInterest(principalAmount,interestRate,timePeriod);
    }

    public static void calculateSimpleInterest(double amount,float intRate,short time){
        double simpleInterest = (amount*intRate*time)/100;
        System.out.println("The Simple Interest for the PrincipalAmount - "+amount+", InterestRate - "+intRate+", TimePeriod - "+time+" years is :- "+simpleInterest);
        System.out.println("The Final Amount After Adding the Simple Interest is :- "+(amount+simpleInterest));
    }
}
