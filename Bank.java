import java.util.Scanner;

class Bank {
    private double balance;

    public Bank(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Error: Insufficient funds.");
            }
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = inp.nextDouble();
        Bank account = new Bank(initialBalance);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = inp.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = inp.nextDouble();
                    account.deposit(depAmount);
                    System.out.println("Balance after deposit: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmount = inp.nextDouble();
                    account.withdraw(withAmount);
                    System.out.println("Balance after withdrawal: " + account.getBalance());
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting. Thank you for using the bank account simulation.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }


        inp.close();
    }
}
