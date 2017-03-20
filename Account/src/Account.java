import java.util.Scanner;

public class Account {
	private float balance;
	
	public void credit(float add){
		balance+=add;
			}
	
	public void debit(float with){
		balance-=with;
		}
		
	
	public float balance(){
		return balance;
	}
	
	protected float setBalance(float b){
		balance=b;
		return balance;
	}
}