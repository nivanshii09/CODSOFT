package util;

import java.util.Scanner;

public class InputValidator {

    public static int getInt(Scanner scanner) {

        while (!scanner.hasNextInt()) {

            System.out.print("Invalid input. Enter a number: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static double getDouble(Scanner scanner) {

        while (!scanner.hasNextDouble()) {

            System.out.print("Invalid input. Enter a valid amount: ");
            scanner.next();
        }

        return scanner.nextDouble();
    }
}
