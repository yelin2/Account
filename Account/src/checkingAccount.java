
public class checkingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	
	public void setInterest(double i){
		interest=i;
	}
	public void setLoanInterest(double li){
		loan_interest=li;
	}
	public void setCreditLimit(double cl){
		credit_limit=cl;
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