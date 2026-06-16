package com.student.management.system.oops;

public class SportsActivityFee implements Payable {

	private final double equipmentCharges;
	private final double tournamentFees;
	private final double uniformCosts;
	private final double statePlayerDiscount;
	private double finalSportsFeesAmount;

	public SportsActivityFee(double equipmentCharges, double tournamentFees, double uniformCosts,
			double statePlayerDiscount) {
		super();
		this.equipmentCharges = equipmentCharges;
		this.tournamentFees = tournamentFees;
		this.uniformCosts = uniformCosts;
		this.statePlayerDiscount = statePlayerDiscount;

	}

	@Override
	public double calculatePayment() {

		finalSportsFeesAmount = equipmentCharges + tournamentFees + uniformCosts - statePlayerDiscount;
		return finalSportsFeesAmount;
	}

	@Override
	public void generateReciept() {
		System.out.println("********** GENERATING SPORTS FEES RECEIPT ***********");
		System.out.println("EQUIPMENT CHARGES : " + equipmentCharges);
		System.out.println("TOURNAMENT FEES : " + tournamentFees);
		System.out.println("UNIFORM COSTS : " + uniformCosts);
		System.out.println("DISCOUNT FOR STATE PLAYERS : -" + statePlayerDiscount);
		System.out.println("TOTAL SPORTS FEES TO PAID : " + finalSportsFeesAmount);
		System.out.println("************ GOOD DAY!! ************");

	}

	@Override
	public double getDiscount() {
		return statePlayerDiscount;
	}

}
