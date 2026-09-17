package OOP;

public class BankAccount_Simple {

    private String name;
    private double balance = 0;

    public BankAccount_Simple(String name) {
        this.name = name;
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

    public void showBalance() {
        System.out.printf("Hey %s your bank account balance is EUR %.2f %n", this.name, this.balance);
    }

}