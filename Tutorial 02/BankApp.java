class BankAccount {
    private int accNumber;
    private String name;
    private double balance;

    public BankAccount() {
        this.accNumber = 0;
        this.balance = 0;
        this.name = "";
    }

    public BankAccount(int accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(double balance) {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }

    public void display() {
        System.out.println("Account number : " + this.accNumber);
        System.out.println("Name : " + this.name);
        System.out.println("Balance : " + this.balance);
    }
}

public class BankApp {
    public static void main(String args[]) {
        BankAccount account01 = new BankAccount(12341, "kaveen", 200000.00);
        BankAccount account02 = new BankAccount(253535, "Dinethma", 30000.00);

        account01.display();
        System.out.println("");
        account02.display();
    }
}
