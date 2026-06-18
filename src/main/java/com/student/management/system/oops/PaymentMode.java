package com.student.management.system.oops;

public enum PaymentMode implements Demo {

	CASH("Payment via Cash") {
		@Override
		public void test() {
			System.out.println("From cash test method");

		}
	},
	UPI("Payment via Google Pay") {
		@Override
		public void test() {
			System.out.println("From UPI test method");

		}
	},
	CARD("Payment via Credit card") {
		@Override
		public void test() {
			System.out.println("From CARD test method");

		}
	},
	BITCOIN("Payment via Bitcoin") {
		@Override
		public void test() {
			System.out.println("From BITCOIN test method");

		}
	};

	public String description;

	private PaymentMode(String description) {

		this.description = description;

	}

	public String getDescription() {

		return description;
	}

	@Override
	public void demo() {
		System.out.println("From demo method");

	}

	public abstract void test();

}
