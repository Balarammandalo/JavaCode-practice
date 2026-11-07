package com.kodewala.rbiInterface;

interface RBI {
	void pay();
	
	void settle();
	
	void cancleTranx();
	
	default void minBalance() 
	{
		
	}
}
