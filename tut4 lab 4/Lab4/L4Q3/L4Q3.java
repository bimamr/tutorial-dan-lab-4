package L4Q3;

import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0.0;
        double sumSquares = 0.0;
        double score;
        int count = 0;
        double minimum = Double.POSITIVE_INFINITY;
        double maximum = Double.NEGATIVE_INFINITY;

        while (true) {
            System.out.print("Enter a score [negative score to quit]: ");
            score = input.nextDouble();

            if (score < 0) {
                break;
            }

            sum += score;
            sumSquares += score * score;
            count++;

            if (score < minimum) {
                minimum = score;
            }
            if (score > maximum) {
                maximum = score;
            }
        }

        if (count == 0) {
            System.out.println("No scores were entered.");
        } else {
            double average = sum / count;
            double standardDeviation = 0.0;

            if (count > 1) {
                double variance = (sumSquares - (sum * sum / count)) / (count - 1);
                standardDeviation = Math.sqrt(Math.max(variance, 0.0));
            }

            System.out.println(sum);
            System.out.println("Minimum Score: " + minimum);
            System.out.println("Maximum Score: " + maximum);
            System.out.printf("Average Score: %.2f%n", average);
            System.out.printf("Standard Deviation: %.2f%n", standardDeviation);
        }

        input.close();
    }
}
