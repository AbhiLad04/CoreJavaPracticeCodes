package com.core_java_practise;

import java.util.Scanner;

public class AreaOfRectangle {

    public int calculateRectangleArea(int len,int bred){

        int area = len*bred;
        System.out.printf("The Area of the Rectangle is :- %d",area);
        return area;
    }

}


class Rectangle{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle :- ");
        int length = sc.nextInt();
        System.out.println("Enter the Bredth of the Rectangle :- ");
        int breadth = sc.nextInt();

        AreaOfRectangle R1 = new AreaOfRectangle();
        R1.calculateRectangleArea(length,breadth);
    }

}
