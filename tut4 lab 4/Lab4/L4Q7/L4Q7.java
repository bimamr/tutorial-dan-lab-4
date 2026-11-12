package L4Q7;

import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter interest in %: ");
        double annualRate = input.nextDouble();

        System.out.print("Enter total number of months: ");
        int months = input.nextInt();

        if (principal <= 0 || annualRate < 0 || months <= 0) {
            System.out.println("Invalid loan details.");
            input.close();
            return;
        }

        double monthlyRate = annualRate / 1200.0;
        double monthlyPayment;

        if (monthlyRate == 0) {
            monthlyPayment = principal / months;
        } else {
            monthlyPayment = principal * monthlyRate
                    / (1 - Math.pow(1 + monthlyRate, -months));
        }

        double balance = principal;
        double totalInterest = 0.0;

        System.out.printf("%-8s%-18s%-15s%-15s%-18s%-15s%n",
                "Month", "Monthly Payment", "Principal", "Interest",
                "Unpaid Balance", "Total Interest");

        for (int month = 1; month <= months; month++) {
            double interest = balance * monthlyRate;
            double principalPaid = monthlyPayment - interest;

            if (month == months || principalPaid > balance) {
                principalPaid = balance;
                monthlyPayment = principalPaid + interest;
            }

            balance -= principalPaid;
            totalInterest += interest;

            System.out.printf("%-8d%-18.2f%-15.2f%-15.2f%-18.2f%-15.2f%n",
                    month, monthlyPayment, principalPaid, interest,
                    Math.max(balance, 0.0), totalInterest);
        }

        input.close();
    }
}
