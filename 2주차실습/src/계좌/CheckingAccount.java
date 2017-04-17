package °èÁÂ;

public class CheckingAccount extends Account implements Valuable{
	
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
	
	public void debit(double money) throws MinusException, OverMaxException{
		if(money < 0){
			throw new MinusException();
		}
		else if(money > credit_limit){
			throw new OverMaxException();
		}
		else{
			super.debit(money);
		}
	}
	
	public void nextMonth(double b){
		if(b > 0) month = b + b * interest;
		else if(b < 0) month = b + b * loan_interest;
		super.setBalance();
	}
	
	public double getWithdrawableAccount() {
		double tot;
		tot = balance + credit_limit;
		if(tot <= 0) tot = 0;
		return tot;
	}
	
	public void passTime(int a) {
		balance = balance * (1 + interest * a);		
	}
	
	public boolean isBankrupted() {
		if (this.getWithdrawableAccount() > 0) return true;
		else return false;
	}
	@Override
	public String toString(){
		return "CheckingAccount_Balance:" + Double.toString(balance);
	}

	@Override
	public double estimateValue(int month) {
		// TODO Auto-generated method stub
		return balance+(month*interest*100);
	}
}