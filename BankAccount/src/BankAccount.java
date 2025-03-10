import java.util.Scanner;

public class BankAccount {
    private double balance = 1000;

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount <= balance) balance -= amount; else System.out.println("Insufficient funds."); }
    public double getBalance() { return balance; }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.println("Balance: " + account.getBalance()); break;
                case 2: System.out.print("Enter amount: "); account.deposit(sc.nextDouble()); break;
                case 3: System.out.print("Enter amount: "); account.withdraw(sc.nextDouble()); break;
                case 4: return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
