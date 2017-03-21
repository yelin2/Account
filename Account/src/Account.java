import java.util.Scanner;

public class Account {
	private double balance;
	
	public void credit(double add){
		balance+=add;
			}
	
	public void debit(double with){
		balance-=with;
		if(balance<0){
			balance+=with;
			System.out.print("Debit amount exceeded account balance.\n");
		}
		}
		
	
	public double balance(){
		return balance;
	}
	
	protected void setBalance(double b){
		balance=b;
		
	}
	public double getBalance(){
		return balance;
	}
}