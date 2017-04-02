package ����;

public class SavingAccount extends Account{
	
	private double interest;
	private double month = 0;
	
	public SavingAccount(double balance, double interest) {
		super(balance);
		this.interest = interest;
	}
	
	public void debit(double money){
		if(month > 12) super.debit(money);
		else System.out.println("���� ����� �� �����ϴ�.");
	}
	
	public double getWithdrawableAccount() {
		double tot = 0;
		if (month >= 12) tot = balance;
		return tot;
	}
	
	public void passTime(int a) {
		month += a;
		if( month >= 13) balance = balance;
		if( month == 12) balance = balance * Math.pow((1+interest), month);
		else balance = balance;
	}

}
