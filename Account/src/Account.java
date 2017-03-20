import java.util.Scanner;

public class Account {
	private float balance;
	
	public void credit(float add){
		balance+=add;
			}
	
	public void debit(float with){
		balance-=with;
		if(balance<0){
			balance+=with;
			System.out.print("Debit amount exceeded account balance.\n");
		}
		}
		
	
	public float balance(){
		return balance;
	}
	
	protected void setBalance(float b){
		balance=b;
	}
}