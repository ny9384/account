package °èÁÂ;

public abstract class Account {
   protected double balance;
   
   public Account(double initialBalance)
   {      
      if (initialBalance>0.0) balance=initialBalance;
   }
   
   public void credit(double amount)
   {
      balance=balance+amount;
   }
   
   public void debit(double amount) throws MinusException, OverMaxException
   {	
	   balance=balance-amount;
   }

   public double getBalance()
   {
      return balance;
   }
   
   public void setBalance()
   {
	   balance = CheckingAccount.month;
   }
   
   public abstract double getWithdrawableAccount();	   
   public abstract void passTime(int a);
}

 

 

 
