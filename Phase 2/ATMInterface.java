import java.util.Scanner;
public class ATMInterface {
    private double balance;
    public ATMInterface() {
        this.balance = 100000;
    }
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit successful.");
    }
    public void checkBalance() {
        System.out.println("Your balance is $" + this.balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMInterface atm = new ATMInterface();
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount to withdraw:");
                    double amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    amount = scanner.nextDouble();
                    atm.deposit(amount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}           