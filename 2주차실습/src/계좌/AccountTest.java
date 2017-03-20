package 계좌;

import java.util.Scanner;   //scan(입력)기능을 위한 import   

public class AccountTest {
   
   public static void main(String[] args) {
      double account1, account2;
      double money;
      int sel, sel2;
      Scanner input =new Scanner(System.in);
      
      System.out.print("account1 balance: ");
      account1 = input.nextDouble();
      System.out.print("account2 balacne: ");
      account2 = input.nextDouble();
         
      Account a = new Account (account1);
      Account b = new Account(account2);
      
      while(true) {
         
         System.out.print("\n무슨 작업을 하시겠습니까? 1 -> 입금, 2 -> 인출, 3 -> 잔액조회, 4 -> 끝내기: ");
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
                  System.out.printf("\nsubtracting %.2f from account1 balance\n\n", money);
                  a.debit(money);
            
                  System.out.printf("account1 balance: $%.2f\n",a.getBalance());
                  System.out.printf("account2 balance: $%.2f\n",b.getBalance());
               }
               if (sel2==2) {
                  System.out.print("\nEnter withdrawal amount for account2 : ");
                  money = input.nextDouble();
                  System.out.printf("\nsubstracting %.2f from account2 balance\n\n", money);
                  b.debit(money);
            
                  System.out.printf("account1 balance: $%.2f\n",a.getBalance());
                  System.out.printf("account2 balance: $%.2f\n",b.getBalance());
               }
            }
            if (sel==3) {
               System.out.printf("account1 balance: $%.2f\n",a.getBalance());
               System.out.printf("account2 balance: $%.2f\n",b.getBalance());
            }
            if (sel==4) System.exit(0);
      }
   }
}
