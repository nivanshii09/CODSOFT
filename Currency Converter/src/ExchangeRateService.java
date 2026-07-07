import java.util.HashMap;
import java.util.Map;

public class ExchangeRateService {

    private Map<String, Double> exchangeRates;

    public ExchangeRateService() {

        exchangeRates = new HashMap<>();

        // Base Currency : INR

        exchangeRates.put("INR", 1.0);
        exchangeRates.put("USD", 0.012);
        exchangeRates.put("EUR", 0.010);
        exchangeRates.put("GBP", 0.0086);
        exchangeRates.put("JPY", 1.75);
    }

    public double getExchangeRate(String currencyCode) {
        return exchangeRates.getOrDefault(currencyCode.toUpperCase(), -1.0);
    }

    public boolean isValidCurrency(String currencyCode) {
        return exchangeRates.containsKey(currencyCode.toUpperCase());
    }

    public void displaySupportedCurrencies() {
        System.out.println("\nSupported Currencies:");

        for (String code : exchangeRates.keySet()) {
            System.out.println("- " + code);
        }
    }
}