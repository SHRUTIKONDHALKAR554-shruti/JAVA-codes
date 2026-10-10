class Bank {

    String accountHolderName;
    double balance;

    void transferTo(Bank receiver, double amount) {

        if (balance >= amount) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            
        }
    }
}

public class Main{

    public static void main(String[] args) {

        Bank a1 = new Bank();
        Bank a2 = new Bank();

        

        a1.balance = 20000;
        a2.balance = 15000;

        a1.transferTo(a2,5000);

        System.out.println("a1 Balance:" + a1.balance);
        System.out.println("a1 Balance:" + a2.balance);
    }
}