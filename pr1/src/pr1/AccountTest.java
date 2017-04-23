package pr1;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){

		
		Scanner input=new Scanner(System.in);
		
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingsAccount(100,0.05);
		
		double amount;
		System.out.printf("Account1 balance: %.2f \t 현재 출금가능액: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter Withdrawal amount for Account1: ");
		amount=input.nextDouble();
		account1.debit(amount);
		
		System.out.printf("Account1 balance: %.2f \t 현재 출금가능액: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()==true){
			System.out.print("account1 went Bankrupt!\n");
		}
		account1.passTime(1);
		System.out.printf("Account1 balance: %.2f \t 현재 출금가능액: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()==true){
			System.out.print("account1 went Bankrupt!\n");
		}
		account1.passTime(5);
		System.out.printf("Account1 balance: %.2f \t 현재 출금가능액: %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()==true){
			System.out.print("account1 went Bankrupt!\n");
		}
		
		System.out.println();
		System.out.printf("Account2 balance: %.2f \t 현재 출금가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		System.out.println("6 Month later!\n");
		account2.passTime(6);
		System.out.printf("Account2 balance: %.2f \t 현재 출금가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);	
		System.out.println("next 6 Month later!\n");
		account2.passTime(6);
		System.out.printf("Account2 balance: %.2f \t 현재 출금가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());	
		System.out.println("next 1 Month later!\n");
		account2.passTime(1);
		System.out.printf("Account2 balance: %.2f \t 현재 출금가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: %.2f \t 현재 출금가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		
	//	System.out.printf("Account2 balance: %.2f \t 현재 출금가능액: %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
	}
}
