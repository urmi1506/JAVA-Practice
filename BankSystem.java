/*Redesign this class using encapsulation.

Requirements:

Fields should not be directly accessible.
Balance should not accept invalid deposits.
A user should be able to:
Deposit money
Withdraw money
Check the balance
Prevent invalid object state. */

public class BankSystem {
    class BankAccount {
        private String accountHolder;
        private double balance;

        public BankAccount(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            if (balance >= 0) {
               this.balance = balance;
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }
        }

        public double getBalance() {
            return balance;
        }
    }
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        BankAccount account1 = bankSystem.new BankAccount("John Doe", 1000);
        account1.deposit(500);
        account1.withdraw(200);
        System.out.println("Current Balance: " + account1.getBalance());
    }
}