package com.student.management.system.oops;

public class TransportFee implements Payable {

	private final double baseFee;
	private final int noOfMonths;
	private final double siblingDiscount;
	private double finalTransportFeesAmount;

	public TransportFee(double baseFee, int noOfMonths, double siblingDiscount) {
		super();
		this.baseFee = baseFee;
		this.noOfMonths = noOfMonths;
		this.siblingDiscount = siblingDiscount;
	}

	@Override
	public double calculatePayment() {

		finalTransportFeesAmount = (baseFee * noOfMonths) - siblingDiscount;
		return finalTransportFeesAmount;
	}

	@Override
	public void generateReciept() {
		System.out.println("********** GENERATING TRANSPORT FEES RECEIPT ***********");
		System.out.println("BASE FEES : " + baseFee);
		System.out.println("NO OF MONTHS : " + noOfMonths);
		System.out.println("SIBLING DISCOUNT : -" + siblingDiscount);
		System.out.println("TOTAL TRANSPORT FEES TO PAID : " + finalTransportFeesAmount);
		System.out.println("************ GOOD DAY!! ************");

	}

	@Override
	public double getDiscount() {
		return siblingDiscount;
	}

}
