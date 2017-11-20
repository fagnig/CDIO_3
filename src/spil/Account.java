package spil;

public class Account {
	int balance;
	
	Account(int startingBalance){
		balance = startingBalance;
	}
	
	public void add(int value) {
		balance += value;
	}
	
	public int getBalance(){
		return balance;
	}
}
