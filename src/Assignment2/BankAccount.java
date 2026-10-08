package Assignment2;

public class BankAccount {
    String accountNo, holderName;
    double accountBalance;

    public BankAccount(){
        this.accountNo = "000000";
        this.holderName = "Unknown";
        this.accountBalance = 0.0;
    }
    public BankAccount(String accountNo, String holderName, double accountBalance){
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.accountBalance = accountBalance;
    }
    void deposit(double amount){
        accountBalance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + accountBalance);
    }
    String withdraw(double amount){
        if (amount <= accountBalance) {
            accountBalance -= amount;
            return "Withdrawal successful. Remaining balance: " + accountBalance;
        } else {
            return "Insufficient funds.";
        }
    }
    double getBalance(){
        return accountBalance;
    }
    String getAccountInfo(String branch){
        return "Account No: " + accountNo + ", Holder Name: " +holderName + ", Branch: " + branch;
    }

    public static void main(String[] args){
        BankAccount account1 = new BankAccount("123456", "John Doe", 1000.0);

        System.out.println();
        System.out.println(account1.getAccountInfo("Main Branch"));
        account1.deposit(500.0);
        account1.withdraw(200.0);
        System.out.println("Current Balance: " + account1.getBalance());
        System.out.println(account1.withdraw(1500.0));
        System.out.println(account1.getAccountInfo("Main Branch"));
    }
}
