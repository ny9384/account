package 계좌;

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
			System.out.println("대출한도를 초과할 수 없습니다.");
		}
		else{
			if(balance >= money) super.debit(money);
			else{
				super.debit(money);
				System.out.println("잔액이 마이너스입니다.");
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