package com.core_java_practise;
import java.util.Scanner;
public class ArrayOfClass {

    public String name;
    public int rollNo;
    public float percentage;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayOfClass[] classes = new ArrayOfClass[5];
        classes[0] = new ArrayOfClass();
        classes[1] = new ArrayOfClass();
        classes[2] = new ArrayOfClass();
        classes[3] = new ArrayOfClass();
        classes[4] = new ArrayOfClass();

        for(int i=0;i<classes.length;i++){
            System.out.printf("Enter The Details of Student :- %d\n",i+1);
            System.out.print("Enter the Name :- ");
            classes[i].name = sc.next();
            System.out.print("Enter The Roll No :- ");
            classes[i].rollNo = sc.nextInt();
            System.out.print("Enter the Percentage :- ");
            classes[i].percentage = sc.nextFloat();
        }

        ArrayOfClass test = new ArrayOfClass();
        test.printStudentInfo(classes);
    }

    public void printStudentInfo(ArrayOfClass[] Students){

        for(int i=0;i<Students.length;i++){
            System.out.printf("\n---------- Printing The Information of Student :- %d ----------\n",i+1);
            System.out.print("\nThe Name of the Student is :- "+Students[i].name);
            System.out.print("\nThe Roll No of the Student is :- "+Students[i].rollNo);
            System.out.println("\nThe Percentage of the Student is :- "+Students[i].percentage);
        }
    }
}