public class Encapsulation {

    private String name;
    private int balance;

    public Encapsulation(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        Encapsulation account = new Encapsulation("Anna", 100);

        account.deposit(50);
        System.out.println(account.getName() + "'s balance: " + account.getBalance());

        account.withdraw(30);
        System.out.println(account.getName() + "'s balance: " + account.getBalance());

        account.withdraw(1000); // rejected, no direct field access possible from outside
    }
}
