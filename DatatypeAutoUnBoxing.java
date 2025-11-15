package com.core_java_practise;

public class DatatypeAutoUnBoxing {

    public static void main(String[] args){

     Integer A = 44;
     int a = A; // Unboxing of the Integer Datatype from Integer to int of Variable A into a.
        System.out.println(A);
        System.out.println(a);

     int b = 99;
     Integer B = b; // Autoboxing of the int to Integer .
     System.out.println(b);
     System.out.println(B);

    }
}
