package com.core_java_practise;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius of the Circle :- ");
        float radius = sc.nextFloat();

        AreaOfCircle circle1 = new AreaOfCircle();
        System.out.printf("The Area of The Circle with Radius %.2f is :- %.3f",radius,circle1.calculateAreaOfCircle(radius));

    }

    public float calculateAreaOfCircle(float rad){

        float area = 3.14f*rad*rad;
        return area;
    }


}
