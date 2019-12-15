package com.hdfc.loans.homeloans;

public class VariableTypes {
	
	int x = 10;   //instance or non-static or global variable
	static String cname = "vmware";  // static variable
	
	public void method1()
	{
		int y = 15;  // local variable
		System.out.println(x);
		System.out.println(cname);
		System.out.println(VariableTypes.cname);
		System.out.println("I am instance method1");
	}

	public static void method2()
	{
		System.out.println("I am static method2");
		VariableTypes obj = new VariableTypes();    // reference variable
		obj.method1();
	}
	
	public static void main(String[] args) {
		
		VariableTypes obj = new VariableTypes();    // reference variable
		System.out.println(obj.x);
		System.out.println(cname);
		System.out.println(VariableTypes.cname);
		obj.method1();
		method2();
	}

}
