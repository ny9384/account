package °èÁÂ;

public class Account {
   public double balance;
   
   public Account(double initialBalance)
   {      
      if (initialBalance>0.0) this.balance=initialBalance;

   }
   
   public void credit(double amount)
   {
      balance=balance+amount;
   }
   
   public void debit(double amount)
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

}

 

 

 
