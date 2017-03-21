import java.util.Scanner;

public class checkingAccountTest {
	public static void main(String[] args){
		checkingAccount account1=new checkingAccount();
		checkingAccount account2=new checkingAccount();
		
		account1.setBalance(100);
		account2.setBalance(100);
		
		account1.setCreditLimit(100);
		account2.setCreditLimit(100);
		
		System.out.printf("Account1 balance: %f$\n",account1.getBalance());
		System.out.printf("Account2 balance: %f$\n",account2.getBalance());

		System.out.print("Enter deposit amount for Account1:");
		Scanner input = new Scanner(System.in);
		int deposit=input.nextInt();
		account1.credit(deposit);
		
		System.out.printf("Account1 balance: %f$\n",account1.getBalance());
		System.out.printf("Account2 balance: %f$\n",account2.getBalance());
		
		System.out.print("Enter withdrawal amount for Account2:");
		int withdrawal=input.nextInt();
		account2.debit(withdrawal);
		System.out.printf("Account1 balance: %f$\n",account1.getBalance());
		System.out.printf("Account2 balance: %f$\n",account2.getBalance());
		
		account1.setInterest(0.01);
		account2.setLoanInterest(0.07);
		account1.nextMonth();
		account2.nextMonth();
		
		System.out.print("next month!\n");
		System.out.printf("Account1 balance: %f$\n",account1.getBalance());
		System.out.printf("Account2 balance: %f$\n",account2.getBalance());
		
	}

}
