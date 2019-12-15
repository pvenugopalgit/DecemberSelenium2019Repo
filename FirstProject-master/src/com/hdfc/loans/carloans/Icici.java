package com.hdfc.loans.carloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		Icici icici = new Icici();
		icici.deposit();
		icici.withdrawl();
	}

	@Override
	public void deposit() {
		System.out.println("I am deposit method from Rbi Interface overridden by Icici Class");
		
	}

	@Override
	public void withdrawl() {
		System.out.println("I am withdrawl method from Rbi Interface overridden by Icici Class");
		
	}

}
