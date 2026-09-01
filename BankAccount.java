public class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    static int totalAccounts;

    public BankAccount(){

    }
    public BankAccount(String accountNumber ,String accountHolderName ,double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName =accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount < 0){
            System.out.println("Invalid Deposit Amount");
        }
        balance += amount;
    }

    void withdraw(double amount){
        if(balance < amount){
           System.out.println("Insufficient Balance");
        }
        if(amount > 0 && balance > amount){
            balance -= amount;
        }
    }

    void transfer(BankAccount receiver ,double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount Entered");
        }
        if(balance < amount){
            System.out.println("Insufficient Amount ,Transfer Failed");
        }
        balance -= amount;
        receiver.balance += amount;

        System.out.println("RS."+amount+"Amount Transfer from"+accountHolderName+"To"+receiver.accountHolderName);
    }

    void display(){
        
    }
}