package com.core_java_practise;
import java.util.Scanner;
public class CelsiusToFahrenheitConverter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature in Celsius to Convert in Fahrenheit :- ");
        float tempCelsius = sc.nextFloat();
        convertTemperatureToFahrenheit(tempCelsius);
    }

    public static void convertTemperatureToFahrenheit(float tempCelsius){
        float tempFahrenheit = (tempCelsius*1.8f)+32;
        System.out.println("The Temperature in Fahrenheit is :- "+tempFahrenheit);
    }
}
