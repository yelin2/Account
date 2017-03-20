
public class checkingAccount extends Account {
	private float credit_limit;
	private float interest;
	private float loan_interest;
	
	
	public void setInterest(float i){
		interest=i;
	}
	public void setLoanInterest(float li){
		loan_interest=li;
	}
	public void setCreditLimit(float cl){
		credit_limit=cl;
	}
	
	@Override
	public void debit(float with){
		
	}

}
