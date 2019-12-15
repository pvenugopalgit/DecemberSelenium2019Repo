package com.inheritance;

public class B extends A {

	public void m2()
	{
		System.out.println("I am m1 from Class B");
	}

	public static void main(String[] args) {
		
		B b = new B();  // This is called Has A Relationship.
		b.m2();
		b.m1();    // This is called Is A Relationship.
		
		A a = new A();  // This is called Has A Relationship.
		a.m1();
	}

}
