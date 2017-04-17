import java.util.InputMismatchException;
import java.util.Scanner;

public class checkingAccountTest {
	public static void main(String args[]){
		Account account1=new checkingAccount(100,50,0.01,0.07);
		Account account2=new SavingsAccount(100,0.05);
		Human a = new Human("Mark",20);
		Car b= new Car("MyCar",5000);
		
		System.out.printf("CheckingAccount_Balance:%f\n",account1.getBalance());
		System.out.printf("1 month later Value (Method Overloading, no parameter):%f\n",account1.EstimateValue());
		System.out.printf("5 month later Value : %f\n",account1.EstimateValue(5));
		
		System.out.printf("SavingAccount_Balance: %f\n",account2.getBalance());
		System.out.printf("1 month later Value (Method Overloading, no parameter):%f\n",account2.EstimateValue());
		System.out.printf("5 month later Value :%f\n",account2.EstimateValue(5));
	
		System.out.printf(a.toString());
		System.out.printf("1 month later Value (Method Overloading, no parameter):%f\n",a.EstimateValue());
		System.out.printf("5 month later Value :%f\n",a.EstimateValue(5));
		
		System.out.printf(b.toString());
		System.out.printf("1 month later Value (Method Overloading, no parameter):%f\n",b.EstimateValue());
		System.out.printf("5 month later Value :%f\n",b.EstimateValue(5));
	
	}
	
}