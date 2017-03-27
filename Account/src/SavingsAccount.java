
public class SavingsAccount extends Account {

	private double interest;
	private int month;
	
	public SavingsAccount(double balance, double interest){
		super(balance);
		this.interest=interest;
	}
	
	public double getWithdrawableAccount() {
		return getBalance();
	}
	
	public void passTime(int m){
		month=m;
		if(month>12){
			setBalance(getBalance()*(1+interest));
		}
	}
	

	public void debit(double with){
		if(month<12){
			System.out.print("아직은 출금할 수 없습니다 |ㅜ");
		}else {
			if(getBalance()-with>0){
				setBalance(getBalance()-with);
			}else {
				System.out.print("한도를 초과했습니다|n");
			}
		}
	}
}
