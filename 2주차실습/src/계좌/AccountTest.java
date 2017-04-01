package 계좌;

import java.util.Scanner;   //scan(입력)기능을 위한 import   

public class AccountTest {
   
   public static void main(String[] args) {
	  //Account account1=new CheckingAccount(100,50,0.01,0.07);
	  //Account account2=new SavingAccount(100,0.05);
	   
	   //Scanner scan = new Scanner(System.in;
	   //double amount;
      
	  //System.out.printf("Account1 balance: $ %.2f \t현재출금가능액 :%.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
	  //System.out.println("Enter withdrawal amount for Account1:");
	  //amount=scan.nextDouble();
	  //account1.out.printf("Account1 balance :$%.2f \t현재출금가능액 :%.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
	 //System.out.print("account1 balance :");
	   307
	   
	  double account1, credit_limit1, interest1, loan_interest1;
      double account2, credit_limit2, interest2, loan_interest2;
      double money;
      int sel, sel2;
      Scanner input =new Scanner(System.in);
      
      System.out.print("account1 balance: ");
      account1 = input.nextDouble();
      if(account1<=0){
    	  System.out.print("0이상의 수를 입력하세요 ! \n");
    	  System.exit(0);
      }
      System.out.print("account1 credit_limit: ");
      credit_limit1 = input.nextDouble();
      System.out.print("account1 interest: ");
      interest1 = input.nextDouble();
      System.out.print("account1 loan_interest: ");
      loan_interest1 = input.nextDouble();
      CheckingAccount a = new CheckingAccount (account1, credit_limit1, interest1, loan_interest1);
      
      System.out.print("account2 balance: ");
      account2 = input.nextDouble();
      if(account2<=0){
    	  System.out.print("0이상의 수를 입력하세요 ! \n");
    	  System.exit(0);
      }
      System.out.print("account2 credit_limit: ");
      credit_limit2 = input.nextDouble();
      System.out.print("account2 interest: ");
      interest2 = input.nextDouble();
      System.out.print("account2 loan_interest: ");
      loan_interest2 = input.nextDouble();
      CheckingAccount b = new CheckingAccount (account2, credit_limit2, interest2, loan_interest2);
      
      while(true) {
    	    System.out.print("\n무슨 작업을 하시겠습니까? 1 -> 입금, 2 -> 인출, 3 -> 다음 달 잔액변동, 4 -> 끝내기: ");
    	    sel=input.nextInt();
      
            if (sel==1) {
               System.out.print("\n1 -> 1번계좌, 2-> 2번계좌: ");
               sel2=input.nextInt();
               if (sel2==1) {
                  System.out.print("\nEnter credit amount for account1 : ");
                  money = input.nextDouble();
                  System.out.printf("\nadding %.2f from account1 balance\n\n", money);
                  a.credit(money);
            
                  System.out.printf("account1 balance: $%.2f\n",a.getBalance());
                  System.out.printf("account2 balance: $%.2f\n",b.getBalance());
               }
               if (sel2==2) {
                  System.out.print("\nEnter credit amount for account2 : ");
                  money = input.nextDouble();
                  System.out.printf("\nadding %.2f from account2 balance\n\n", money);
                  b.credit(money);
            
                  System.out.printf("account1 balance: $%.2f\n",a.getBalance());
                  System.out.printf("account2 balance: $%.2f\n",b.getBalance());
               }
            }
            if (sel==2) {
               System.out.print("\n1 -> 1번계좌, 2-> 2번계좌: ");
               sel2=input.nextInt();
               if (sel2==1) {
                  System.out.print("\nEnter withdrawal amount for account1 : ");
                  money = input.nextDouble();
                  a.debit(money);       
                  System.out.printf("account1 balance: $%.2f\n",a.getBalance());
                  System.out.printf("account2 balance: $%.2f\n",b.getBalance());
               }
               if (sel2==2) {
                  System.out.print("\nEnter withdrawal amount for account2 : ");
                  money = input.nextDouble();
                  b.debit(money);       
                  System.out.printf("account1 balance: $%.2f\n",a.getBalance());
                  System.out.printf("account2 balance: $%.2f\n",b.getBalance());
               }
            }
            if (sel==3) {
            	System.out.println("next month!");
            	a.nextMonth(a.getBalance());
            	b.nextMonth(b.getBalance());
            	System.out.printf("account1 balance: $%.2f\n", a.balance);
            	System.out.printf("account2 balance: $%.2f\n", b.balance);
            }
            if (sel==4) System.exit(0);
      }
   }
}
