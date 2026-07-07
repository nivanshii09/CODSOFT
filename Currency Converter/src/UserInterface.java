import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ExchangeRateService rateService;
    private CurrencyConverter converter;

    public UserInterface() {
        scanner = new Scanner(System.in);
        rateService = new ExchangeRateService();
        converter = new CurrencyConverter(rateService);
    }

    public void start() {

        System.out.println("==================================");
        System.out.println("      Currency Converter");
        System.out.println("==================================");

        rateService.displaySupportedCurrencies();

        System.out.print("\nEnter Source Currency: ");
        String from = scanner.next();

        System.out.print("Enter Target Currency: ");
        String to = scanner.next();

        if (!rateService.isValidCurrency(from) || !rateService.isValidCurrency(to)) {
            System.out.println("\nInvalid currency code.");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("\nAmount cannot be negative.");
            return;
        }

        double result = converter.convert(from, to, amount);

        System.out.println("\n========== Result ==========");
        System.out.printf("%.2f %s = %.2f %s%n",
                amount,
                from.toUpperCase(),
                result,
                to.toUpperCase());

        scanner.close();
    }
}
