public class BankAccountsBasic{
/*""" DAY -1
Problem :Design a simple Bank Account.

Requirements:
Account should have account number
Account should have balance
It should be able to deposit money
It should be able to check balance */

   class BankAccount{
        int  accountNumber;
        double balance;

        void deposit(double amount){
            balance += amount;
        }

        double getBalance(){
            return balance;
        }
   }

   public static void main(String[] args){
       BankAccountsBasic bank = new BankAccountsBasic();
       BankAccount account1 = bank.new BankAccount();
       account1.accountNumber = 12345;
       account1.balance = 5000;
       account1.deposit(1000);
       account1.getBalance();
   }
}