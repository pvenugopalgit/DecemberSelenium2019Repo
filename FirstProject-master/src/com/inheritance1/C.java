package com.inheritance1;

import com.inheritance.A;
import com.inheritance.B;

public class C extends B {

	public void m3()
	{
		System.out.println("I am m3 from Class C");
	}
	
	public void m1()
	{
		System.out.println("I am overideen method m1 from Class A");
	}

	public static void main(String[] args) {
		
		C c = new C();  // This is called Has A Relationship.
		c.m3();
		c.m1();    // This is called Is A Relationship.
		c.m2();    // This is called Is A Relationship.
		
		B b = new B();  // This is called Has A Relationship.
		b.m2();
		
		A a = new A();  // This is called Has A Relationship.
		a.m1();
	}

}
