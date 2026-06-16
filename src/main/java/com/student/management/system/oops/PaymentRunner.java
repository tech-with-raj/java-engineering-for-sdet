package com.student.management.system.oops;

public class PaymentRunner {

	public static void main(String[] args) {

		Payable payable = new TuitionFee(50000, 10000, 5000);
		payable.calculatePayment();
		payable.processPayment("Cash");
		payable.generateReciept();

		System.out.println(payable.getDiscount());
		System.out.println();

		Payable payable2 = new SportsActivityFee(5000, 3000, 2000, 1000);
		payable2.calculatePayment();
		payable.processPayment("Card");
		payable2.generateReciept();
		System.out.println(payable2.getDiscount());
		System.out.println();

		Payable payable3 = new TransportFee(1000, 4, 500);
		payable3.calculatePayment();
		payable3.processPayment("UPI");
		payable3.generateReciept();
		System.out.println(payable3.getDiscount());
		System.out.println();
		
		
		Payable payable4 = new LibraryFee(500, 200, 100);
		payable4.calculatePayment();
		payable4.processPayment("Bitcoin");
		payable4.generateReciept();
		System.out.println(payable4.getDiscount());
	}

}
