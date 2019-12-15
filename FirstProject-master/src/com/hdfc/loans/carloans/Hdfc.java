package com.hdfc.loans.carloans;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
		Hdfc hdfc = new Hdfc();
		
		hdfc.deposit();
		hdfc.withdrawl();
	}

	@Override
	public void deposit() {
		System.out.println("I am deposit method from Rbi Interface overridden by Hdfc Class");
		
	}

	@Override
	public void withdrawl() {
		System.out.println("I am withdrawl method from Rbi Interface overridden by Hdfc Class");
		
	}

}
