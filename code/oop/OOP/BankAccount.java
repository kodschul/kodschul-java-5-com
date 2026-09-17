package OOP;

public class BankAccount {

    private String name;
    private double balance = 0;

    private BankCard visaCard;

    public BankAccount(String name) {
        this.name = name;
    }

    public BankCard registerVisaCard() {

        this.visaCard = new BankCard(this);
        return this.visaCard;
    }

    public void deposit(double newAmt) {

        if (newAmt < 0) {

            System.out.println("Too small, deposit more :)");
            return;
        }
        this.balance += Math.abs(newAmt);
    }

    public void withdraw(double newAmt) {

        if (newAmt < 0) {

            System.out.println("Too small, you have cash, take more :)");
            return;
        }

        this.balance -= Math.abs(newAmt);
    }

    public boolean transfer(BankAccount receiver, double amount) {
        this.withdraw(amount);

        receiver.deposit(amount);
        return true;
    }

    public void showBalance() {
        System.out.printf("Hey %s your bank account balance is EUR %.2f %n", this.name, this.balance);
    }

    public boolean isTransactionPossible(double amount) {
        return this.balance >= amount;
    }

}