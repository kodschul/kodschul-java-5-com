package OOP;

public class ClassesDemo {

    public static void main(String[] args) {

        bankCards();
    }

    public static void bankCards() {

        BankAccount aliceBk = new BankAccount("Alice");

        aliceBk.deposit(1000);
        aliceBk.showBalance();

        BankCard aliceVisa = aliceBk.registerVisaCard();
        aliceVisa.purchase("Computer", 1000);

        aliceBk.showBalance();
    }

    public static void bankTransferDemo() {

        BankAccount aliceBk = new BankAccount("Alice");
        // aliceBk.deposit(500);
        aliceBk.showBalance();

        BankAccount bobBk = new BankAccount("Bob");
        bobBk.showBalance();

        System.out.println("------Alice sends 300EUR to Bob");

        aliceBk.transfer(bobBk, 300);
        aliceBk.showBalance();
        bobBk.showBalance();

        System.out.println("-----Bob sends 150EUR back to Alice");

        bobBk.transfer(aliceBk, 150);
        bobBk.showBalance();
        aliceBk.showBalance();

    }

    public static void bankDemo() {

        BankAccount aliceBk = new BankAccount("Alice");
        BankAccount bobBk = new BankAccount("Bob");

        aliceBk.deposit(1000);
        aliceBk.withdraw(100);

        System.out.println(aliceBk);

        aliceBk.showBalance();
        bobBk.showBalance();
    }

    public static void playerDemo(String[] args) {

        Player p1 = new Player("Alice", 10);






        

        p1.attempts = 10000000;

        p1.showInfo();

        Player p2 = new Player("Bob", 5);
        p2.showInfo();

        System.out.println("p2 > p1: "
                + p2.hasMoreAttemptsThan(p1));
        System.out.println("p1 > p2:" + p1.hasMoreAttemptsThan(p2));

    }
}
