package pr1;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){

		
		Scanner input=new Scanner(System.in);
		
		/*ex 1
		Account account1=new Account(50.0);
		Account account2=new Account(0.0);
		System.out.print("account1 balance: "+account1.getBalance()+"\n");
		System.out.print("account2 balance: "+account2.getBalance()+"\n");
		
		System.out.print("Enter withdrawal amount for account1: " );
		double with=input.nextDouble();
		account1.debit(with);
		if(account1.getBalance()<0){
			account1.setBalance(account1.getBalance()+with);
		}
		
		System.out.print("Subtracting "+with+"from account1 balance\n");
		System.out.print("account1 balance: $"+account1.getBalance()+"\n");
		System.out.print("account2 balance: $"+account2.getBalance()+"\n");
		
		System.out.print("Enter withdrawal amount for account2: " );
		with=input.nextDouble();
		System.out.print("Subtracting "+with+"from account2 balance\n");
		account2.debit(with);
		if(account2.getBalance()<0){
			account2.setBalance(account2.getBalance()+with);
			System.out.print("Debit amount exceeded amount balance\n");
		}
		
		System.out.print("account1 balance: $"+account1.getBalance()+"\n");
		System.out.print("account2 balance: $"+account2.getBalance()+"\n");*/
		
		Account account1 = new CheckingAccount(100,200,0.01,0.07);
		Account account2 = new CheckingAccount(100,200,0.01,0.07);
		
		System.out.print("Account1 balance: $"+account1.getBalance() +"\n");
		System.out.print("Account2 balance: $"+account2.getBalance() +"\n");
		System.out.print("Enter deposit amount for Account1: ");
		double add=input.nextDouble();
		account1.credit(add);
		
		System.out.print("Account1 balance: $"+account1.getBalance() +"\n");
		System.out.print("Account2 balance: $"+account2.getBalance() +"\n");
		System.out.print("Enter withdrawal amount for Account2: ");
		double with=input.nextDouble();
		account2.debit(with);
		
		System.out.print("Account1 balance: $"+account1.getBalance() +"\n");
		System.out.print("Account2 balance: $"+account2.getBalance() +"\n");
		((CheckingAccount)account1).nextMonth();
		((CheckingAccount)account2).nextMonth();
		
		System.out.print("next month!\n");
		System.out.print("Account1 balance: $"+account1.getBalance() +"\n");
		System.out.print("Account2 balance: $"+account2.getBalance() +"\n");
		
		
		
		
		
		
	}
}
