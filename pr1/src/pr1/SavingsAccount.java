package pr1;

public class SavingsAccount extends Account {

	private double interest;
	private int month;
	
	public SavingsAccount(double balance, double interest){
		super(balance);
		this.interest=interest;
	}
	
	
	//@Override 여기는 왜 Override 안씀;;;
	public double getWithdrawableAccount(){
		if(month<12){
			return 0.0;
		}else{
			return getBalance();
		}
	}
	
	//@Override
	public void passTime(int month) {
		this.month+=month;
		if(this.month==12){
			setBalance(getBalance()*Math.pow((1+interest), 12));
		}
		
	}
	
	@Override
	public void debit(double with){
		if(month<12){
			System.out.print("아직은 출금할 수 없습니다!\n");
		}else{
			setBalance(getBalance()-with);
		}
	}
}