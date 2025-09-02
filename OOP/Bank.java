package OOP;
// ENCAPSULATION PROGRAM
class Bank {
    private int balance;  // hidden (cannot be accessed directly)

    // constructor
    public Bank(int initialBalance) {
        balance = initialBalance;
    }

    // public methods to safely interact
    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not enough balance!");
        }
    }

    public int getBalance() {
        return balance;
    }
}
class Main{
    public static void main(String[] args) {
        Bank bank=new Bank(1000);
        bank.deposit(500);
        bank.withdraw(200);
        System.out.println(bank.getBalance());
    }
}