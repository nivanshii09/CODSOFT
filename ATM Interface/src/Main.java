import atm.ATM;
import bank.BankAccount;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        ATM atm = new ATM(account);

        System.out.println("==================================");
        System.out.println("      WELCOME TO JAVA ATM");
        System.out.println("==================================");

        atm.start();
    }
}