package ����;

public class Account {
   private double balance;
   
   public Account(double initialBalance)
   {
      
      if (initialBalance>0.0) balance=initialBalance;
      else {
         System.out.print("0�̻��� ���� �Է��ϼ��� ! \n");
         System.exit(0);
      }
   }
   
   public void debit(double amount)
   {
      if(amount>balance){
         System.out.print("Debit amount exceeded acciynt balance ! �ܾ׺���\n");
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

 

 

 
