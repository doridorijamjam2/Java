package kr.or.shi;

public class Account {
	
	int deposit;
	int withdraw;
	int getBalance;
	
	void deposit() {
		getBalance += deposit;
	}
	
	void withdraw() {
		getBalance -= withdraw;
	}
	
	void getBalance() {
		
	}
	
	void exit() {
		
	}

}
