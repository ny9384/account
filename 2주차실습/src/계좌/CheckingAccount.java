package ����;

public class CheckingAccount extends Account {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	static double month;
	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest) {
		super(balance);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	
	public void debit(double money){
		if(money>credit_limit){
			System.out.println("�����ѵ��� �ʰ��� �� �����ϴ�.");
		}
		else{
			if(balance >= money) super.debit(money);
			else{
				super.debit(money);
				System.out.println("�ܾ��� ���̳ʽ��Դϴ�.");
			}
		}
	}
	public void nextMonth(double b){
		if(b > 0) month = b + b * interest;
		else if(b < 0) month = b + b * loan_interest;
		super.setBalance();
		//return balance;
	}
}