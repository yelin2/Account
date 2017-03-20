import java.util.Scanner;

public class AccountTest {
	public static void main(String [] args) {
		Account account1=new Account();
		Account account2=new Account();
		
		System.out.printf("account1 balance: $%f\n",account1.balance());
		System.out.printf("account2 balance: $%f\n",account2.balance());
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter add amount for account1:");
		float add1=input.nextInt();
		account1.credit(add1);
		System.out.print("Enter add amount for account2:");
		float add2=input.nextInt();
		account2.credit(add2);
		
		System.out.printf("account1 balance: $%f\n",account1.balance());
		System.out.printf("account2 balance: $%f\n",account2.balance());
		
		System.out.print("Enter withdraw amount for account1:");
		float withdraw1=input.nextInt();
		if(account1.balance()-withdraw1>=0){
			account1.debit(withdraw1);
		}else{
			System.out.print("Debit amount exceeded account balance.\n");
		}
		System.out.print("Enter withdraw amount for account2:");
		float withdraw2=input.nextInt();
		if(account2.balance()-withdraw2>=0){
			account2.debit(withdraw2);
		}else{
			System.out.print("Debit amount exceeded account balance.\n");
		}
		
		System.out.printf("account1 balance: $%f\n",account1.balance());
		System.out.printf("account2 balance: $%f\n",account2.balance());
	}
}
