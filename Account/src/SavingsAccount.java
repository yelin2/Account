
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
			System.out.print("������ ����� �� �����ϴ� |��");
		}else {
			if(getBalance()-with>0){
				setBalance(getBalance()-with);
			}else {
				System.out.print("�ѵ��� �ʰ��߽��ϴ�|n");
			}
		}
	}
}
