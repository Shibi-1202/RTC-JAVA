import java.util.Scanner ;
abstract class BankAccount {
    protected double balance;

  
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class AbstractBank {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Your initial balance for Savings account: ");
        double initbal = inp.nextDouble();

        SavingsAccount savings = new SavingsAccount(initbal);
        System.out.print("Enter Amount to be deposited: ");
        double dep = inp.nextDouble();
        savings.deposit(dep);
        System.out.print("Enter amount to withdraw: ");
        double with = inp.nextDouble();
        savings.withdraw(with);

        System.out.println("Savings Account Balance: " + savings.getBalance());

        System.out.print("Enter Your initial balance for current account: ");
        double initbalc = inp.nextDouble();

        CurrentAccount current = new CurrentAccount(initbalc);
        System.out.print("Enter Amount to be deposited: ");
        double depc = inp.nextDouble();
        current.deposit(depc);
        System.out.print("Enter amount to withdraw: ");
        double withc = inp.nextDouble();
        current.withdraw(withc);

        System.out.println("Current Account Balance: " + current.getBalance());
        inp.close();
    }
}
