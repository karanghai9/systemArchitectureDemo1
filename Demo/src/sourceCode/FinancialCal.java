package sourceCode;
import java.util.Scanner;

public class FinancialCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Debt Value");
        double debtValue = scanner.nextDouble(); // in eur
        System.out.println("Enter Interest Rate");
        double interestRate = scanner.nextDouble(); // in percentage
        System.out.println("Enter Duration");
        int paybackDuration = scanner.nextInt(); // in months

        // Calculating monthly amount (Interest rate + principle amount per month)
        double monthlyRate = calculateMonthlyRate(debtValue, interestRate, paybackDuration);

        // Calculating overall debt
        double overallDebt = calculateOverallDebt(debtValue, interestRate, paybackDuration);

        System.out.println("Monthly Rate: " + monthlyRate);
        System.out.println("Number of Rates: " + paybackDuration);
        System.out.println("Overall Debt: " + overallDebt);
    }

    public static double calculateMonthlyRate(double debtValue, double interestRate, int paybackDuration) {
    	double monthly_rate = 0.0;
    	if(debtValue>0 && interestRate>0 && paybackDuration>0) {
    		monthly_rate = debtValue/paybackDuration + debtValue * (interestRate/paybackDuration)* 0.01;
    	}
    	return monthly_rate;
    }

    public static double calculateOverallDebt(double debtValue, double interestRate, int paybackDuration) {
        return Math.abs(calculateMonthlyRate(debtValue, interestRate, paybackDuration) * paybackDuration); //Math.abs, to return a positive value always.
    }
}

