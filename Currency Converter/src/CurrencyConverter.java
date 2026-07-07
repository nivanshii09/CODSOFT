public class CurrencyConverter {

    private final ExchangeRateService rateService;

    public CurrencyConverter(ExchangeRateService rateService) {
        this.rateService = rateService;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {

        fromCurrency = fromCurrency.toUpperCase();
        toCurrency = toCurrency.toUpperCase();

        if (!rateService.isValidCurrency(fromCurrency)
                || !rateService.isValidCurrency(toCurrency)) {
            return -1;
        }

        // Convert source currency to INR
        double amountInINR = amount / rateService.getExchangeRate(fromCurrency);

        // Convert INR to target currency
        return amountInINR * rateService.getExchangeRate(toCurrency);
    }

}
