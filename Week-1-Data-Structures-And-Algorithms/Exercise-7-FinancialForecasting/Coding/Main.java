package forecasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial amount: ");
        double initialAmount = scanner.nextDouble();

        System.out.print("Enter annual growth rate (as %): ");
        double growthRatePercent = scanner.nextDouble();
        double growthRate = growthRatePercent / 100;

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double futureValue = ForecastCalculator.calculateFutureValue(initialAmount, growthRate, years);

        System.out.printf("Predicted future value after %d years: ₹%.2f%n", years, futureValue);
        
        scanner.close();
    }
}
