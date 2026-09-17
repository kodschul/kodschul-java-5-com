package OOP;

public class BankCard {

    BankAccount bankAccount;

    boolean isValid = false;

    public BankCard(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.isValid = true;
    }

    public boolean purchase(String item, double amount) {

        if (!this.bankAccount.isTransactionPossible(amount)) {
            System.out.println("Purchase of " + item + " is not possible, Balance low!");
            return false;
        }

        this.bankAccount.withdraw(amount);

        System.out.printf("Transaction of %s | EUR %.2f was sucessful.%n", item, amount);

        return true;
    }

}
