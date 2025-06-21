package forecasting;

public class ForecastCalculator {

    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }

        return calculateFutureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }
}
