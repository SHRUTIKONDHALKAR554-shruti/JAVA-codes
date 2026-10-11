import java.util.Scanner;

class BankAccount {
    private String holder;
    private int accountNumber;
    private double balance;

    BankAccount(String holder, int accountNumber, double balance) {
        if (balance < 0 || accountNumber <= 0) {
            throw new IllegalArgumentException("Invalid account details.");
        }

        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance += amount;
            System.out.println("Deposit Successful");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + holder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Final Balance: " + balance);
    }
}

public class bank_account_transaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Holder: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        int number = sc.nextInt();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        try {
            BankAccount account = new BankAccount(name, number, balance);

            System.out.print("Deposit: ");
            account.deposit(sc.nextDouble());

            System.out.print("Withdrawal: ");
            account.withdraw(sc.nextDouble());

            account.display();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    
    }
}