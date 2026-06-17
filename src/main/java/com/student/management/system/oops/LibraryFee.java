package com.student.management.system.oops;

public class LibraryFee implements Payable {

	private double basicSubscription;
	private double additionalBookCharges;
	private double lateReturnPenalty;
	private double finalLibraryFees;

	public LibraryFee(double basicSubscription, double additionalBookCharges, double lateReturnPenalty) {
		super();
		this.basicSubscription = basicSubscription;
		this.additionalBookCharges = additionalBookCharges;
		this.lateReturnPenalty = lateReturnPenalty;
	}

	@Override
	public double calculatePayment() {

		finalLibraryFees = basicSubscription + additionalBookCharges + lateReturnPenalty;

		return finalLibraryFees;
	}
	
	@Override
	public boolean processPayment(PaymentMode paymentMode) {

	    if (paymentMode == PaymentMode.BITCOIN) {

	        System.out.println("Connecting to wallet! and transfering bitcoin");

	        return true;

	    } else {

	        return false;
	    }
	}

	@Override
	public void generateReciept() {

		System.out.println("************ GENERATING LIBRARY FEES RECEIPT ************");

		System.out.println("BASIC SUBSCRIPTION      : " + basicSubscription);
		System.out.println("ADDITIONAL BOOK CHARGES : " + additionalBookCharges);
		System.out.println("LATE RETURN PENALTY     : " + lateReturnPenalty);
		System.out.println("TOTAL FEES TO PAID      : " + finalLibraryFees);

		System.out.println("************ GOOD DAY!! ************");
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
}