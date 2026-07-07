package atm;

import bank.BankAccount;
import java.util.Scanner;
import util.InputValidator;

public class ATM {

    private final BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {

        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            Menu.display();
            choice = InputValidator.getInt(scanner);

            switch (choice) {

                case 1:

                    System.out.printf("\nCurrent Balance : ₹%.2f%n", account.getBalance());
                    break;

                case 2:

                    System.out.print("Enter amount : ₹");
                    if (account.deposit(InputValidator.getDouble(scanner)))
                        System.out.println("Deposit Successful.");
                    else
                        System.out.println("Invalid Amount.");

                    break;

                case 3:

                    System.out.print("Enter amount : ₹");
                    if (account.withdraw(InputValidator.getDouble(scanner)))
                        System.out.println("Withdrawal Successful.");
                    else
                        System.out.println("Insufficient Balance.");

                    break;

                case 4:

                    account.showTransactions();
                    break;

                case 5:

                    System.out.println("\nThank you for using our ATM.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}