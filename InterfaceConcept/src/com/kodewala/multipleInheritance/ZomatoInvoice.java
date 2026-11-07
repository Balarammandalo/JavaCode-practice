package com.kodewala.multipleInheritance;

public interface ZomatoInvoice {
	default void getInvoice() {
		System.out.println("ZOmato invoice download");
	};
}
