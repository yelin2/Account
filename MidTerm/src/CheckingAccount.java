
public class CheckingAccount extends Account {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest) {
		super(balance);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	
	@Override
	public void debit(double with){
		if(getBalance()-with<-credit_limit){
			System.out.print("Debit amount exceeded credit limit!\n");
		}else{
			setBalance(getBalance()-with);
		}
	}
	
	public void nextMonth(){
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest));
		}else{
			setBalance(getBalance()*(1+loan_interest));
		}
	}
	
}
