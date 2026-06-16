package com.student.management.system.oops;

public interface Payable {

	
	public abstract double calculatePayment();
	
	public default boolean processPayment(String paymentMode) {
		if (paymentMode.equalsIgnoreCase("CASH") || paymentMode.equalsIgnoreCase("UPI")
				|| paymentMode.equalsIgnoreCase("CARD")) {

			System.out.println("Processing payment.....");
			System.out.println("Payment Sucessful!!");
			return true;

		} else {
			System.err.println("Something went wrong...");
			return false;
		}

	}
	
	public abstract void generateReciept();
	
	public abstract double getDiscount();
}
