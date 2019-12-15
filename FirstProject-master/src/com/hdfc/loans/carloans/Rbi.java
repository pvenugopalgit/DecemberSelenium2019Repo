package com.hdfc.loans.carloans;

public interface Rbi {
	
	public void deposit();
	public void withdrawl();
	
	public static void main(String[] args) {
		Rbi rbi;
		//Rbi rbi = new Rbi(); // We can't create an object reference to an Interface directly. But we can create indirectly.
		
		 rbi = new Hdfc(); // The below 2 methods during compile time they refer to Rbi interface but during run time they refer to Implemented class(Hdfc.) This is called run time polymorphism.
	
		rbi.deposit();
		rbi.withdrawl();
		
		 rbi = new Icici(); // The below 2 methods during compile time they refer to Rbi interface but during run time they refer to Implemented class(Icici.) This is called run time polymorphism.
		 rbi.deposit();
		 rbi.withdrawl();
	}
}
