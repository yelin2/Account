
public class Account {
	private double balance;
	
	public Account(double balance){
		setBalance(balance);
	}
	
	protected void setBalance(double balance){
		this.balance=balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void credit(double add){
		setBalance(add+balance);
	}
	
	public void debit(double with){
		setBalance(balance-with);
	}

}
