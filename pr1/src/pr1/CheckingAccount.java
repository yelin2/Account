package pr1;


public class CheckingAccount extends Account {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	private int month;
	
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

	@Override
	public double getWithdrawableAccount(){
		if(isBankrupted()==false){
			return getBalance()+credit_limit;
		}else{
			return 0.0;
		}
		
	}
	
	@Override
	public void passTime(int month){
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest*month));
		}else{
			setBalance(getBalance()*(1+loan_interest*month));
			}
		this.month=month;
	}
	
	public boolean isBankrupted(){
		if(getBalance()<-credit_limit){
			return true;
		}else{
			return false;
		}
	}
}
