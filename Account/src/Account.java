import java.util.Scanner;

public class Account {
	private float total;
	
	public void credit(float add){
		total+=add;
			}
	
	public void debit(float with){
		total-=with;
		}
		
	
	public float balance(){
		return total;
	}
}