package work04;

public class BankAccount {
    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner, double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }

    public void transfer(double amount, BankAccount account) {
        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "BankAccount(" + getOwner().getId() + ", " + getBalance() + ")";
    }
}
