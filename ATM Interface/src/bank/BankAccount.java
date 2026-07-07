package bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private double balance;
    private List<Transaction> transactions;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
        transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {

        if (amount <= 0)
            return false;

        balance += amount;
        transactions.add(new Transaction("Deposit", amount));

        return true;
    }

    public boolean withdraw(double amount) {

        if (amount <= 0 || amount > balance)
            return false;

        balance -= amount;
        transactions.add(new Transaction("Withdraw", amount));

        return true;
    }

    public void showTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        System.out.println("\nTransaction History");

        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}