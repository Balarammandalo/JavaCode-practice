package com.kodewala.customeClonable;

class AccountInfo implements UserConfrom {
	int accountBalance;
	String accountNumber;
	int withDrawAmount;

	public AccountInfo(int balance, String _accountNum, int withDrawAmt) {
		this.accountBalance = balance;
		this.accountNumber = _accountNum;
		this.withDrawAmount = withDrawAmt;
	}
}

class MoneyWithdraw {
	
	public void printDetails(AccountInfo obj) {

		if (obj instanceof UserConfrom) {
			
			System.out.println("Money withdraw successfully");

//			AccountInfo acc = (AccountInfo) obj;
//			System.out.println(acc.accountBalance);
//			System.out.println(acc.accountNumber);
//			System.out.println(acc.withDrawAmount);
		} else {
			System.err.println("User not verify");
		}
	}
}

public class Driver {
	public static void main(String[] args) {
		AccountInfo aci = new AccountInfo(4000, "1234321", 2000);

		MoneyWithdraw mw = new MoneyWithdraw();
		mw.printDetails(aci);
	}
}
