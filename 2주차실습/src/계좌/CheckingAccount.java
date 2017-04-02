package °èÁÂ;

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
		super.debit(money);
	}
	
	public void nextMonth(double b){
		if(b > 0) month = b + b * interest;
		else if(b < 0) month = b + b * loan_interest;
		super.setBalance();
	}
	
	public double getWithdrawableAccount() {
		double tot;
		tot = balance + credit_limit;
		return tot;
	}
	
	public void passTime(int a) {
		balance = balance * Math.pow((1+loan_interest), a);
		
	}
	
	public boolean isBankrupted() {
		if (this.getWithdrawableAccount() > 0) return true;
		else return false;
	}
}