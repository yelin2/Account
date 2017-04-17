import java.util.InputMismatchException;

public class SavingsAccount extends Account {

	private double interest;
	private int month;
	
	public SavingsAccount(double balance, double interest){
		super(balance);
		this.interest=interest;
	}
	
	public double getWithdrawableAccount() {
		if(month>12){
			return getBalance();
		} else {
			return 0.0;
		}
	}
	
	public void passTime(int m){
		month=month+m;
		if(month==12){
			setBalance(getBalance()*Math.pow((1+interest), month));
		}
	}
	
	public void passTime(){
		if(month==12){
			setBalance(getBalance()*Math.pow((1+interest), month));
		}
	}
	
	
	public void debit(double with) throws Exception{
		if(with<0){
			throw new Exception();
		}
		if(month<12){
			throw new Exception("음수입력");
			//System.out.print("아직은 출금할 수 없습니다 \n");
		}else {
			if(getBalance()-with>0){
				setBalance(getBalance()-with);
			}else {
				throw new Exception("Debit amount exceeded account balance");
			}
		}
	}
	public double getinterest(){
		return interest;
	
	}
	public double EstimateValue(int month){
		if(this.month==1){
			setBalance(getBalance()/(1+interest));
		}
		setBalance(getBalance()*Math.pow((1+interest), month));
		return getBalance();
	}
	
	public double EstimateValue(){
		month=1;
		setBalance(getBalance()*(1+interest));
		return getBalance();
	}
	
	public String toString(){
		return String.format("SavingAccount_price"+getBalance());
	}
}
