package Assignment;

public class Wallet {
    String ownerName;
    double balance;

    public void setWallet(String name, double initialBalance) {
        ownerName = name;
        balance = initialBalance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount.");
        };
    }

    public boolean spend(double amount){
        if (amount <= balance){
            balance -= amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean transferTo(Wallet receiver , double amount){

        if (spend(amount)) {
            receiver.addMoney(amount);
            return true;
        }
        else{
            return false;
        }
    }

    public String compareBalance(Wallet other){

        if (balance > other.balance){
            return ownerName + " has more money than " + other.ownerName;
        }
        else if (balance < other.balance){
            return other.ownerName + " has more money than " + ownerName;
                }
        else{
            return ownerName + " and " + other.ownerName + " have the same amount of money";
        }
    }
    public static void main(String[] atgs){

        Wallet wallet1 = new Wallet();
        wallet1.setWallet("Alice", 100.0);

        Wallet wallet2 = new Wallet();
        wallet2.setWallet("Bob", 50.0);

        System.out.println("\n");
        wallet1.transferTo(wallet2, 30.0);
        wallet1.transferTo(wallet2, 1000.0);
        System.out.println(wallet1.compareBalance(wallet2));
    }
}
