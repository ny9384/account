package 계좌;

public class Account {
   private double balance;
   
   public Account(double initialBalance)
   {
      
      if (initialBalance>0.0) balance=initialBalance;
      else {
         System.out.print("0이상의 수를 입력하세요 ! \n");
         System.exit(0);
      }
   }
   
   public void debit(double amount)
   {
      if(amount>balance){
         System.out.print("Debit amount exceeded acciynt balance ! 잔액부족\n");
      }
      else balance=balance-amount;

   }
   
   public void credit(double amount)
   {
      balance=balance+amount;
   }
   public double getBalance()
   {
      return balance;
   }

}

 

 

 
