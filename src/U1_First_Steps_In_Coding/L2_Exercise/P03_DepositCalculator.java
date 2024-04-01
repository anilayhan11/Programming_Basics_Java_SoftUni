package U1_First_Steps_In_Coding.L2_Exercise;

import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // sum = deposited sum  + deposit period * ((deposited sum * annual interest rate ) / 12)
        int depositedSum = Integer.parseInt(scanner.nextLine());
        int depositPeriod = Integer.parseInt(scanner.nextLine()); // in months
        double interestRate = Double.parseDouble(scanner.nextLine()); // annual
        double interestRatePercent = interestRate * 0.01;

        double sum = depositedSum + depositPeriod * (depositedSum * interestRatePercent) / 12;

        System.out.println(sum);
    }
}
