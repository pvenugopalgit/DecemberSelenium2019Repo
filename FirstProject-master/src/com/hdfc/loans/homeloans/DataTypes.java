package com.hdfc.loans.homeloans;

public class DataTypes {
/*		byte b = -1;   // 1 byte
		short s = -32768;  // 2 bytes
		int i = 2147483647;  // 4 bytes
		long l = 2147483647; // 8 bytes
		
		float f = 55.34f;  // 4 bytes
		double d = 244.34;  // 8 bytes
		
		boolean bb = true;
		char ch = 'a'; // 2 bytes
		String str = "vmware",   */
	
	byte b;   // 1 byte
	short s;  // 2 bytes
	int i;  // 4 bytes
	long l; // 8 bytes
	
	float f;  // 4 bytes
	double d;  // 8 bytes
	
	boolean bb;
	char ch; // 2 bytes
	
	String str;
		
	public static void main(String[] args) {
		DataTypes dt = new DataTypes();
		
		System.out.println("Byte : " + dt.b);
		System.out.println("Short : " + dt.s);
		System.out.println("Int : " + dt.i);
		System.out.println("Long : " + dt.l);
		
		System.out.println("Float : " + dt.f);
		System.out.println("Double : " + dt.d);
		
		System.out.println("Boolean : " + dt.bb);
		System.out.println("Char : " + dt.ch);
		System.out.println("String : " + dt.str);
		
	/*	Output for Default values:
			Byte : 0
			Short : 0
			Int : 0
			Long : 0
			Float : 0.0
			Double : 0.0
			Boolean : false
			Char :     
			String : null   */

	}

}
