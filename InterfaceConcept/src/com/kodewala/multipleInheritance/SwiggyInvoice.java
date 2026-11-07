package com.kodewala.multipleInheritance;

public interface SwiggyInvoice {
	default void getInvoice() {
		System.out.println("Swiggy invoice download");
	};
}
