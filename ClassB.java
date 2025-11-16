package com.abhi.inheritance.singlelevel;

public class ClassB extends ClassA {   // ClassB is a sub/Derived/child Class extends to ClassA which is super/Parent Class.

	public static void main(String[] args) {
	
	System.out.println(Add(10,20));   // Calling the Static method of Class A.
	ClassB b = new ClassB();
	System.out.println(b.Sub(50,40));  // Calling the Non-Static method of Class A.
	
	
	}

	public static int Mul(int a,int b) {
		return a*b;
	}
}