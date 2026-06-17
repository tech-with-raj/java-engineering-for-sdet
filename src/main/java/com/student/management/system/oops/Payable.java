package com.student.management.system.oops;

public interface Payable {

	public abstract double calculatePayment();

	public default boolean processPayment(PaymentMode paymentMode) {
		
		if (paymentMode == PaymentMode.CASH || paymentMode == PaymentMode.UPI
				|| paymentMode == PaymentMode.CARD) {

			System.out.println("Processing payment.....");
			System.out.println("Payment Sucessful with "+paymentMode);
			return true;

		} else {
			System.err.println("Something went wrong...");
			return false;
		}

	}

	public abstract void generateReciept();

	public abstract double getDiscount();

	
}
