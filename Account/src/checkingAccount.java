
public class checkingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	
	public checkingAccount(double balance, double limit, double interest, double loanInterest){
		super(balance);
		credit_limit=limit;
		this.interest=interest;
		this.loan_interest=loanInterest;
	}
	
	public double getWithdrawableAccount(){
		setBalance(getBalance()+credit_limit);
		return getBalance();
	}
	
	public void passTime(int hours){
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest*hours));
		} else if(getBalance()<0){
			setBalance(getBalance()*(1-getBalance()*loan_interest*hours));
		}
	}
	
	public boolean isBankrupted(){
		return true;
	}
	@Override
	public void debit(double with){
		if(getBalance()-with<-credit_limit){
			System.out.print("exceed limit\n");
		}else if(getBalance()-with>=-credit_limit){
			setBalance(getBalance()-with);
		}
	}

	public void nextMonth(){
		if(getBalance()>0) {
			setBalance(getBalance()*(1+interest));
		}else if(getBalance()<0) {
			setBalance(getBalance()*(1+loan_interest));
		}
	}
}