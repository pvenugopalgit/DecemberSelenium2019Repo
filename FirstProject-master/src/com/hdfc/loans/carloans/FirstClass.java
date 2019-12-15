package com.hdfc.loans.carloans;

public class FirstClass {
	
		public int a=10, b=5, c;  //properties

		public static void main(String[] args) {
		 
		System.out.println("Hello");
		FirstClass fc = new FirstClass();
		fc.add();
		fc.sub();
		System.out.println(fc.c);
	}
	 public void add() {   // Behaviors
		 c = a+b;
		 System.out.println("Sum of a & b is:  " + c);

	 }
	 public void sub() {   // // Behaviors
		 c = a-b;
		 System.out.println("Subtraction of a & bis: " + c);
		 

	 }
}
